package com.fasterxml.jackson.core.io;

import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import defpackage.u40;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonStringEncoder {
    private static final char[] HC = CharTypes.copyHexChars(true);
    private static final byte[] HB = CharTypes.copyHexBytes(true);
    private static final JsonStringEncoder instance = new JsonStringEncoder();

    private int _appendByte(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byteArrayBuilder.append(117);
            if (i > 255) {
                byte[] bArr = HB;
                byteArrayBuilder.append(bArr[i >> 12]);
                byteArrayBuilder.append(bArr[(i >> 8) & 15]);
                i &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byte[] bArr2 = HB;
            byteArrayBuilder.append(bArr2[i >> 4]);
            byteArrayBuilder.append(bArr2[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private int _appendNamed(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int _appendNumeric(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = HC;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    private static int _convert(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i << 10) + i2) - 56613888;
        }
        u40.l("Broken surrogate pair: first char 0x", Integer.toHexString(i), ", second 0x", Integer.toHexString(i2), "; illegal combination");
        return 0;
    }

    private static void _illegal(int i) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
    }

    public static int _initialByteBufSize(int i) {
        return Math.min(Math.max(24, i + 6 + (i >> 1)), 32000);
    }

    public static int _initialCharBufSize(int i) {
        return Math.min(Math.max(16, Math.min((i >> 3) + 6, 1000) + i), 32000);
    }

    private char[] _qbuf() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    public static JsonStringEncoder getInstance() {
        return instance;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] encodeAsUTF8(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r10 = r6 + 1;
        r6 = r14.charAt(r6);
        r11 = r2[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r11 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r6 = _appendNumeric(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r6 = _appendNamed(r11, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r11 = r8 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r11 <= r1.length) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        r11 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r11 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        java.lang.System.arraycopy(r9, 0, r1, r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r7 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r7 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r1 = r7.finishCurrentSegment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        r6 = r6 - r11;
        java.lang.System.arraycopy(r9, r11, r1, 0, r6);
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        defpackage.z3.q(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        java.lang.System.arraycopy(r9, 0, r1, r8, r6);
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r9 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r9 = _qbuf();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public char[] quoteAsString(java.lang.String r14) {
        /*
            r13 = this;
            int r0 = r14.length()
            int r1 = _initialCharBufSize(r0)
            char[] r1 = new char[r1]
            int[] r2 = com.fasterxml.jackson.core.io.CharTypes.get7BitOutputEscapes()
            int r3 = r2.length
            r4 = 0
            r5 = 0
            r6 = r4
            r8 = r6
            r7 = r5
            r9 = r7
        L15:
            if (r6 >= r0) goto L81
        L17:
            char r10 = r14.charAt(r6)
            if (r10 >= r3) goto L61
            r11 = r2[r10]
            if (r11 == 0) goto L61
            if (r9 != 0) goto L27
            char[] r9 = r13._qbuf()
        L27:
            int r10 = r6 + 1
            char r6 = r14.charAt(r6)
            r11 = r2[r6]
            if (r11 >= 0) goto L36
            int r6 = r13._appendNumeric(r6, r9)
            goto L3a
        L36:
            int r6 = r13._appendNamed(r11, r9)
        L3a:
            int r11 = r8 + r6
            int r12 = r1.length
            if (r11 <= r12) goto L5b
            int r11 = r1.length
            int r11 = r11 - r8
            if (r11 <= 0) goto L46
            java.lang.System.arraycopy(r9, r4, r1, r8, r11)
        L46:
            if (r7 != 0) goto L4c
            com.fasterxml.jackson.core.util.TextBuffer r7 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1)
        L4c:
            char[] r1 = r7.finishCurrentSegment()     // Catch: java.io.IOException -> L56
            int r6 = r6 - r11
            java.lang.System.arraycopy(r9, r11, r1, r4, r6)
            r8 = r6
            goto L5f
        L56:
            r13 = move-exception
            defpackage.z3.q(r13)
            return r5
        L5b:
            java.lang.System.arraycopy(r9, r4, r1, r8, r6)
            r8 = r11
        L5f:
            r6 = r10
            goto L15
        L61:
            int r11 = r1.length
            if (r8 < r11) goto L75
            if (r7 != 0) goto L6a
            com.fasterxml.jackson.core.util.TextBuffer r7 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1)
        L6a:
            char[] r1 = r7.finishCurrentSegment()     // Catch: java.io.IOException -> L70
            r8 = r4
            goto L75
        L70:
            r13 = move-exception
            defpackage.z3.q(r13)
            return r5
        L75:
            int r11 = r8 + 1
            r1[r8] = r10
            int r6 = r6 + 1
            if (r6 < r0) goto L7f
            r8 = r11
            goto L81
        L7f:
            r8 = r11
            goto L17
        L81:
            if (r7 != 0) goto L88
            char[] r13 = java.util.Arrays.copyOfRange(r1, r4, r8)
            return r13
        L88:
            r7.setCurrentLength(r8)
            char[] r13 = r7.contentsAsArray()     // Catch: java.io.IOException -> L90
            return r13
        L90:
            r13 = move-exception
            defpackage.z3.q(r13)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    public byte[] quoteAsUTF8(String str) {
        int i;
        int i2;
        int i3;
        int length = str.length();
        byte[] bArrFinishCurrentSegment = new byte[_initialByteBufSize(length)];
        ByteArrayBuilder byteArrayBuilderFromInitial = null;
        int i4 = 0;
        int i_appendByte = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            int[] iArr = CharTypes.get7BitOutputEscapes();
            while (true) {
                char cCharAt = str.charAt(i4);
                if (cCharAt > 127 || iArr[cCharAt] != 0) {
                    break;
                }
                if (i_appendByte >= bArrFinishCurrentSegment.length) {
                    if (byteArrayBuilderFromInitial == null) {
                        byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i_appendByte);
                    }
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i_appendByte = 0;
                }
                int i5 = i_appendByte + 1;
                bArrFinishCurrentSegment[i_appendByte] = (byte) cCharAt;
                i4++;
                if (i4 >= length) {
                    i_appendByte = i5;
                    break loop0;
                }
                i_appendByte = i5;
            }
            if (byteArrayBuilderFromInitial == null) {
                byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i_appendByte);
            }
            if (i_appendByte >= bArrFinishCurrentSegment.length) {
                bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                i_appendByte = 0;
            }
            int i6 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 <= 127) {
                i_appendByte = _appendByte(cCharAt2, iArr[cCharAt2], byteArrayBuilderFromInitial, i_appendByte);
                bArrFinishCurrentSegment = byteArrayBuilderFromInitial.getCurrentSegment();
            } else {
                if (cCharAt2 <= 2047) {
                    i3 = i_appendByte + 1;
                    bArrFinishCurrentSegment[i_appendByte] = (byte) ((cCharAt2 >> 6) | 192);
                    i2 = (cCharAt2 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                } else {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        int i7 = i_appendByte + 1;
                        bArrFinishCurrentSegment[i_appendByte] = (byte) ((cCharAt2 >> '\f') | 224);
                        if (i7 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i7 = 0;
                        }
                        bArrFinishCurrentSegment[i7] = (byte) (((cCharAt2 >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        i = i7 + 1;
                        i2 = (cCharAt2 & TracingInterceptor.URL_QUERY_PARAMS_BLOCK_SEPARATOR) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    } else {
                        if (cCharAt2 > 56319) {
                            _illegal(cCharAt2);
                        }
                        if (i6 >= length) {
                            _illegal(cCharAt2);
                        }
                        int i8 = i4 + 2;
                        int i_convert = _convert(cCharAt2, str.charAt(i6));
                        if (i_convert > 1114111) {
                            _illegal(i_convert);
                        }
                        int i9 = i_appendByte + 1;
                        bArrFinishCurrentSegment[i_appendByte] = (byte) ((i_convert >> 18) | 240);
                        if (i9 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i9 = 0;
                        }
                        int i10 = i9 + 1;
                        bArrFinishCurrentSegment[i9] = (byte) (((i_convert >> 12) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        if (i10 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i10 = 0;
                        }
                        int i11 = i10 + 1;
                        bArrFinishCurrentSegment[i10] = (byte) (((i_convert >> 6) & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                        i2 = (i_convert & 63) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i = i11;
                        i6 = i8;
                    }
                    i3 = i;
                }
                if (i3 >= bArrFinishCurrentSegment.length) {
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i3 = 0;
                }
                bArrFinishCurrentSegment[i3] = (byte) i2;
                i_appendByte = i3 + 1;
            }
            i4 = i6;
        }
        return byteArrayBuilderFromInitial == null ? Arrays.copyOfRange(bArrFinishCurrentSegment, 0, i_appendByte) : byteArrayBuilderFromInitial.completeAndCoalesce(i_appendByte);
    }
}
