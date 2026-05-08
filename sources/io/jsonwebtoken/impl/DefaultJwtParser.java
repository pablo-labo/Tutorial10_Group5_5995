package io.jsonwebtoken.impl;

import defpackage.l5;
import io.jsonwebtoken.ClaimJwtException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.CompressionCodecResolver;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.IncorrectClaimException;
import io.jsonwebtoken.InvalidClaimException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtHandler;
import io.jsonwebtoken.JwtHandlerAdapter;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.MissingClaimException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.impl.compression.DefaultCompressionCodecResolver;
import io.jsonwebtoken.impl.crypto.DefaultJwtSignatureValidator;
import io.jsonwebtoken.impl.crypto.JwtSignatureValidator;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.DeserializationException;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Strings;
import java.security.Key;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultJwtParser implements JwtParser {
    private static final int MILLISECONDS_PER_SECOND = 1000;
    private long allowedClockSkewMillis;
    private Decoder<String, byte[]> base64UrlDecoder;
    private Clock clock;
    private CompressionCodecResolver compressionCodecResolver;
    private Deserializer<Map<String, ?>> deserializer;
    private Claims expectedClaims;
    private Key key;
    private byte[] keyBytes;
    private SigningKeyResolver signingKeyResolver;

    public DefaultJwtParser(SigningKeyResolver signingKeyResolver, Key key, byte[] bArr, Clock clock, long j, Claims claims, Decoder<String, byte[]> decoder, Deserializer<Map<String, ?>> deserializer, CompressionCodecResolver compressionCodecResolver) {
        this.compressionCodecResolver = new DefaultCompressionCodecResolver();
        this.base64UrlDecoder = Decoders.BASE64URL;
        this.expectedClaims = new DefaultClaims();
        Clock clock2 = DefaultClock.INSTANCE;
        this.signingKeyResolver = signingKeyResolver;
        this.key = key;
        this.keyBytes = bArr;
        this.clock = clock;
        this.allowedClockSkewMillis = j;
        this.expectedClaims = claims;
        this.base64UrlDecoder = decoder;
        this.deserializer = deserializer;
        this.compressionCodecResolver = compressionCodecResolver;
    }

    private static Object normalize(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }

    private void validateExpectedClaims(Header header, Claims claims) {
        for (String str : this.expectedClaims.keySet()) {
            Object objNormalize = normalize(this.expectedClaims.get(str));
            Object objNormalize2 = normalize(claims.get(str));
            if (objNormalize instanceof Date) {
                try {
                    objNormalize2 = claims.get(str, Date.class);
                } catch (Exception unused) {
                    throw new IncorrectClaimException(header, claims, "JWT Claim '" + str + "' was expected to be a Date, but its value cannot be converted to a Date using current heuristics.  Value: " + objNormalize2);
                }
            }
            InvalidClaimException missingClaimException = objNormalize2 == null ? new MissingClaimException(header, claims, String.format(ClaimJwtException.MISSING_EXPECTED_CLAIM_MESSAGE_TEMPLATE, str, objNormalize)) : !objNormalize.equals(objNormalize2) ? new IncorrectClaimException(header, claims, String.format(ClaimJwtException.INCORRECT_EXPECTED_CLAIM_MESSAGE_TEMPLATE, str, objNormalize, objNormalize2)) : null;
            if (missingClaimException != null) {
                missingClaimException.setClaimName(str);
                missingClaimException.setClaimValue(objNormalize);
                throw missingClaimException;
            }
        }
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser base64UrlDecodeWith(Decoder<String, byte[]> decoder) {
        Assert.notNull(decoder, "base64UrlDecoder cannot be null.");
        this.base64UrlDecoder = decoder;
        return this;
    }

    public JwtSignatureValidator createSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        return new DefaultJwtSignatureValidator(signatureAlgorithm, key, this.base64UrlDecoder);
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser deserializeJsonWith(Deserializer<Map<String, ?>> deserializer) {
        Assert.notNull(deserializer, "deserializer cannot be null.");
        this.deserializer = deserializer;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public boolean isSigned(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (i == 2) {
                return (Character.isWhitespace(cCharAt) || cCharAt == '.') ? false : true;
            }
            if (cCharAt == '.') {
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    @Override // io.jsonwebtoken.JwtParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.jsonwebtoken.Jwt parse(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.jsonwebtoken.impl.DefaultJwtParser.parse(java.lang.String):io.jsonwebtoken.Jwt");
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jws<Claims> parseClaimsJws(String str) {
        return (Jws) parse(str, new JwtHandlerAdapter<Jws<Claims>>() { // from class: io.jsonwebtoken.impl.DefaultJwtParser.4
            @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
            public /* bridge */ /* synthetic */ Object onClaimsJws(Jws jws) {
                return onClaimsJws((Jws<Claims>) jws);
            }

            @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
            public Jws<Claims> onClaimsJws(Jws<Claims> jws) {
                return jws;
            }
        });
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jwt<Header, Claims> parseClaimsJwt(String str) {
        try {
            return (Jwt) parse(str, new JwtHandlerAdapter<Jwt<Header, Claims>>() { // from class: io.jsonwebtoken.impl.DefaultJwtParser.2
                @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
                public /* bridge */ /* synthetic */ Object onClaimsJwt(Jwt jwt) {
                    return onClaimsJwt((Jwt<Header, Claims>) jwt);
                }

                @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
                public Jwt<Header, Claims> onClaimsJwt(Jwt<Header, Claims> jwt) {
                    return jwt;
                }
            });
        } catch (IllegalArgumentException e) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", e);
        }
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jws<String> parsePlaintextJws(String str) {
        try {
            return (Jws) parse(str, new JwtHandlerAdapter<Jws<String>>() { // from class: io.jsonwebtoken.impl.DefaultJwtParser.3
                @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
                public /* bridge */ /* synthetic */ Object onPlaintextJws(Jws jws) {
                    return onPlaintextJws((Jws<String>) jws);
                }

                @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
                public Jws<String> onPlaintextJws(Jws<String> jws) {
                    return jws;
                }
            });
        } catch (IllegalArgumentException e) {
            throw new UnsupportedJwtException("Signed JWSs are not supported.", e);
        }
    }

    @Override // io.jsonwebtoken.JwtParser
    public Jwt<Header, String> parsePlaintextJwt(String str) {
        return (Jwt) parse(str, new JwtHandlerAdapter<Jwt<Header, String>>() { // from class: io.jsonwebtoken.impl.DefaultJwtParser.1
            @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
            public /* bridge */ /* synthetic */ Object onPlaintextJwt(Jwt jwt) {
                return onPlaintextJwt((Jwt<Header, String>) jwt);
            }

            @Override // io.jsonwebtoken.JwtHandlerAdapter, io.jsonwebtoken.JwtHandler
            public Jwt<Header, String> onPlaintextJwt(Jwt<Header, String> jwt) {
                return jwt;
            }
        });
    }

    public Map<String, ?> readValue(String str) {
        try {
            return this.deserializer.deserialize(str.getBytes(Strings.UTF_8));
        } catch (DeserializationException e) {
            throw new MalformedJwtException(l5.l("Unable to read JSON value: ", str), e);
        }
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser require(String str, Object obj) {
        Assert.hasText(str, "claim name cannot be null or empty.");
        Assert.notNull(obj, "The value cannot be null for claim name: " + str);
        this.expectedClaims.put(str, obj);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireAudience(String str) {
        this.expectedClaims.setAudience(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireExpiration(Date date) {
        this.expectedClaims.setExpiration(date);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireId(String str) {
        this.expectedClaims.setId(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireIssuedAt(Date date) {
        this.expectedClaims.setIssuedAt(date);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireIssuer(String str) {
        this.expectedClaims.setIssuer(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireNotBefore(Date date) {
        this.expectedClaims.setNotBefore(date);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser requireSubject(String str) {
        this.expectedClaims.setSubject(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setAllowedClockSkewSeconds(long j) {
        this.allowedClockSkewMillis = Math.max(0L, j * 1000);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setClock(Clock clock) {
        Assert.notNull(clock, "Clock instance cannot be null.");
        this.clock = clock;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver) {
        Assert.notNull(compressionCodecResolver, "compressionCodecResolver cannot be null.");
        this.compressionCodecResolver = compressionCodecResolver;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(String str) {
        Assert.hasText(str, "signing key cannot be null or empty.");
        this.keyBytes = Decoders.BASE64.decode(str);
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKeyResolver(SigningKeyResolver signingKeyResolver) {
        Assert.notNull(signingKeyResolver, "SigningKeyResolver cannot be null.");
        this.signingKeyResolver = signingKeyResolver;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(byte[] bArr) {
        Assert.notEmpty(bArr, "signing key cannot be null or empty.");
        this.keyBytes = bArr;
        return this;
    }

    @Override // io.jsonwebtoken.JwtParser
    public JwtParser setSigningKey(Key key) {
        Assert.notNull(key, "signing key cannot be null.");
        this.key = key;
        return this;
    }

    @Deprecated
    public DefaultJwtParser() {
        this.compressionCodecResolver = new DefaultCompressionCodecResolver();
        this.base64UrlDecoder = Decoders.BASE64URL;
        this.expectedClaims = new DefaultClaims();
        this.clock = DefaultClock.INSTANCE;
        this.allowedClockSkewMillis = 0L;
    }

    @Override // io.jsonwebtoken.JwtParser
    public <T> T parse(String str, JwtHandler<T> jwtHandler) {
        Assert.notNull(jwtHandler, "JwtHandler argument cannot be null.");
        Assert.hasText(str, "JWT String argument cannot be null or empty.");
        Jwt<Header, String> jwt = parse(str);
        if (jwt instanceof Jws) {
            Jws<String> jws = (Jws) jwt;
            if (jws.getBody() instanceof Claims) {
                return jwtHandler.onClaimsJws(jws);
            }
            return jwtHandler.onPlaintextJws(jws);
        }
        if (jwt.getBody() instanceof Claims) {
            return jwtHandler.onClaimsJwt(jwt);
        }
        return jwtHandler.onPlaintextJwt(jwt);
    }
}
