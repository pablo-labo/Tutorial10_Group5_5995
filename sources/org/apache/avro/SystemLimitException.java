package org.apache.avro;

import defpackage.b0;
import defpackage.h49;
import defpackage.r40;
import defpackage.r6;
import defpackage.t40;
import defpackage.u40;

/* JADX INFO: loaded from: classes3.dex */
public class SystemLimitException extends AvroRuntimeException {
    public static final int a = f("org.apache.avro.limits.bytes.maxLength");
    public static final int b = f("org.apache.avro.limits.collectionItems.maxLength");
    public static final int c = f("org.apache.avro.limits.string.maxLength");

    public static int c(long j) {
        if (j < 0) {
            r40.m(r6.c(j, "Malformed data. Length is negative: "));
            return 0;
        }
        if (j > 2147483639) {
            b0.u("Cannot read arrays longer than 2147483639 bytes in Java library");
            return 0;
        }
        if (j <= a) {
            return (int) j;
        }
        throw new SystemLimitException(u40.c(j, "Bytes length ", " exceeds maximum allowed"));
    }

    public static int d(long j, long j2) {
        long j3 = j + j2;
        if (j < 0) {
            r40.m(r6.c(j, "Malformed data. Length is negative: "));
            return 0;
        }
        if (j2 < 0) {
            r40.m(r6.c(j2, "Malformed data. Length is negative: "));
            return 0;
        }
        if (j3 > 2147483639 || j3 < j) {
            b0.u("Cannot read collections larger than 2147483639 items in Java library");
            return 0;
        }
        if (j3 <= b) {
            return (int) j3;
        }
        throw new SystemLimitException(u40.c(j3, "Collection length ", " exceeds maximum allowed"));
    }

    public static int e(long j) {
        if (j < 0) {
            r40.m(r6.c(j, "Malformed data. Length is negative: "));
            return 0;
        }
        if (j > 2147483639) {
            b0.u("Cannot read strings longer than 2147483639 bytes");
            return 0;
        }
        if (j <= c) {
            return (int) j;
        }
        throw new SystemLimitException(u40.c(j, "String length ", " exceeds maximum allowed"));
    }

    public static int f(String str) {
        String property = System.getProperty(str);
        if (property != null) {
            try {
                return Integer.parseUnsignedInt(property);
            } catch (NumberFormatException e) {
                h49.b(SystemLimitException.class).f(t40.l("Could not parse property ", str, ": ", property), e);
            }
        }
        return 2147483639;
    }
}
