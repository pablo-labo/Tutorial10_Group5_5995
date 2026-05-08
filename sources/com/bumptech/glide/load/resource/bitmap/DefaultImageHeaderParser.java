package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.beb;
import defpackage.kt0;
import defpackage.uz;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(int i, byte[] bArr);

        short c();

        long skip(long j);
    }

    public static final class a implements Reader {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return c() | (c() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b(int i, byte[] bArr) {
            ByteBuffer byteBuffer = this.a;
            int iMin = Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b implements Reader {
        public final InputStream a;

        public b(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() {
            return c() | (c() << 8);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b(int i, byte[] bArr) throws Reader.EndOfFileException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws IOException {
            int i = this.a.read();
            if (i != -1) {
                return (short) i;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                InputStream inputStream = this.a;
                long jSkip = inputStream.skip(j2);
                if (jSkip > 0) {
                    j2 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j2--;
                }
            }
            return j - j2;
        }
    }

    public static int e(Reader reader, kt0 kt0Var) {
        try {
            int iA = reader.a();
            if ((iA & 65496) == 65496 || iA == 19789 || iA == 18761) {
                int iG = g(reader);
                if (iG != -1) {
                    byte[] bArr = (byte[]) kt0Var.c(iG, byte[].class);
                    try {
                        return h(reader, bArr, iG);
                    } finally {
                        kt0Var.put(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iA);
                return -1;
            }
        } catch (Reader.EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType f(Reader reader) {
        try {
            int iA = reader.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | reader.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | reader.c();
            if (iC2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 == 1380533830) {
                reader.skip(4L);
                if (((reader.a() << 16) | reader.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iA2 = (reader.a() << 16) | reader.a();
                if ((iA2 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = iA2 & 255;
                if (i == 88) {
                    reader.skip(4L);
                    short sC = reader.c();
                    return (sC & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.a() << 16) | reader.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (reader.a() << 16) | reader.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iA3 == 1635150182;
            reader.skip(4L);
            int i3 = iC2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iA4 = (reader.a() << 16) | reader.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r9) {
        /*
        L0:
            short r0 = r9.c()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown segmentId="
            r9.<init>(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.c()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L6a
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L3d
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r9)
            return r3
        L3d:
            int r1 = r9.a()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L6b
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r2 = ", but actually skipped: "
            java.lang.String r5 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = defpackage.uz.f(r5, r0, r9, r1, r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L6a:
            return r3
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.g(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):int");
    }

    public static int h(Reader reader, byte[] bArr, int i) {
        ByteOrder byteOrder;
        short s;
        int iB = reader.b(i, bArr);
        short s2 = -1;
        if (iB == i) {
            int i2 = 0;
            byte[] bArr2 = a;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i3 = 0;
                while (true) {
                    if (i3 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i3] != bArr2[i3]) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s3 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s3 != 18761) {
                if (s3 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s3));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i5 = i4 + 6;
            short s4 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
            while (i2 < s4) {
                int i6 = (i2 * 12) + i4 + 8;
                short s5 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : s2;
                if (s5 != 274) {
                    s = s2;
                } else {
                    int i7 = i6 + 2;
                    short s6 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : s2;
                    if (s6 < 1 || s6 > 12) {
                        s = s2;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s6));
                        }
                    } else {
                        int i8 = i6 + 4;
                        int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : s2;
                        if (i9 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                            s = s2;
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                s = s2;
                                StringBuilder sbF = uz.f("Got tagIndex=", i2, " tagType=", s5, " formatCode=");
                                sbF.append((int) s6);
                                sbF.append(" componentCount=");
                                sbF.append(i9);
                                Log.d("DfltImageHeaderParser", sbF.toString());
                            } else {
                                s = s2;
                            }
                            int i10 = i9 + b[s6];
                            if (i10 <= 4) {
                                int i11 = i6 + 8;
                                if (i11 < 0 || i11 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i11 + " tagType=" + ((int) s5));
                                    }
                                } else {
                                    if (i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : s;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s5));
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s6));
                            }
                        }
                    }
                }
                i2++;
                s2 = s;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iB);
            return -1;
        }
        return s2;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, kt0 kt0Var) {
        beb.e(inputStream, "Argument must not be null");
        b bVar = new b(inputStream);
        beb.e(kt0Var, "Argument must not be null");
        return e(bVar, kt0Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType b(ByteBuffer byteBuffer) {
        beb.e(byteBuffer, "Argument must not be null");
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) {
        beb.e(inputStream, "Argument must not be null");
        return f(new b(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int d(ByteBuffer byteBuffer, kt0 kt0Var) {
        beb.e(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        beb.e(kt0Var, "Argument must not be null");
        return e(aVar, kt0Var);
    }
}
