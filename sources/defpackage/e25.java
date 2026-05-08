package defpackage;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.i25;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class e25 {
    public static final e U;
    public static final e[][] V;
    public static final e[] W;
    public static final HashMap<Integer, e>[] X;
    public static final HashMap<String, e>[] Y;
    public static final HashSet<String> Z;
    public static final HashMap<Integer, Integer> a0;
    public static final Charset b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final Pattern e0;
    public static final Pattern f0;
    public static final Pattern g0;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public final HashMap<String, d>[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public byte[] m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public static final boolean t = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> u = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> v = Arrays.asList(2, 7, 4, 5);
    public static final int[] w = {8, 8, 8};
    public static final int[] x = {8};
    public static final byte[] y = {-1, -40, -1};
    public static final byte[] z = {102, 116, 121, 112};
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, 80, 0};
    public static final byte[] D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};
    public static final byte[] J = {87, 69, 66, 80};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] T = {65, 83, 67, 73, 73, 0, 0, 0};

    public class a extends MediaDataSource {
        public long a;
        public final /* synthetic */ g b;

        public a(g gVar) {
            this.b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i, int i2) {
            g gVar = this.b;
            DataInputStream dataInputStream = gVar.a;
            if (i2 == 0) {
                return 0;
            }
            if (j >= 0) {
                try {
                    long j2 = this.a;
                    if (j2 != j) {
                        if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                            gVar.h(j);
                            this.a = j;
                        }
                    }
                    if (i2 > dataInputStream.available()) {
                        i2 = dataInputStream.available();
                    }
                    int i3 = gVar.read(bArr, i, i2);
                    if (i3 >= 0) {
                        this.a += (long) i3;
                        return i3;
                    }
                } catch (IOException unused) {
                }
                this.a = -1L;
                return -1;
            }
            return -1;
        }
    }

    public static class f {
        public final long a;
        public final long b;

        public f(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }

        public final String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        U = new e("StripOffsets", 273, 3);
        V = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        W = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        X = new HashMap[10];
        Y = new HashMap[10];
        Z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        a0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        b0 = charsetForName;
        c0 = "Exif\u0000\u0000".getBytes(charsetForName);
        d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            e[][] eVarArr6 = V;
            if (i >= eVarArr6.length) {
                HashMap<Integer, Integer> map = a0;
                e[] eVarArr7 = W;
                map.put(Integer.valueOf(eVarArr7[0].a), 5);
                map.put(Integer.valueOf(eVarArr7[1].a), 1);
                map.put(Integer.valueOf(eVarArr7[2].a), 2);
                map.put(Integer.valueOf(eVarArr7[3].a), 3);
                map.put(Integer.valueOf(eVarArr7[4].a), 7);
                map.put(Integer.valueOf(eVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            X[i] = new HashMap<>();
            Y[i] = new HashMap<>();
            for (e eVar : eVarArr6[i]) {
                X[i].put(Integer.valueOf(eVar.a), eVar);
                Y[i].put(eVar.b, eVar);
            }
            i++;
        }
    }

    public e25(InputStream inputStream) throws IOException {
        e[][] eVarArr = V;
        this.e = new HashMap[eVarArr.length];
        this.f = new HashSet(eVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            ja.k("inputStream cannot be null");
            throw null;
        }
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                i25.a.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (t) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.c = null;
                this.b = null;
            }
        } else {
            this.c = null;
            this.b = null;
        }
        v(inputStream);
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d3 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d4 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d3 / 60.0d) + d2;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d4;
            }
            return -d4;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            o6.h();
            return 0.0d;
        }
    }

    public static Pair<Integer, Integer> r(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairR = r(strArrSplit[0]);
            if (((Integer) pairR.first).intValue() == 2) {
                return pairR;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairR2 = r(strArrSplit[i]);
                int iIntValue = (((Integer) pairR2.first).equals(pairR.first) || ((Integer) pairR2.second).equals(pairR.first)) ? ((Integer) pairR.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairR.second).intValue() == -1 || !(((Integer) pairR2.first).equals(pairR.second) || ((Integer) pairR2.second).equals(pairR.second))) ? -1 : ((Integer) pairR.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairR = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairR = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairR;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    return (j < 0 || j > 65535) ? j < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static ByteOrder y(b bVar) throws IOException {
        short s = bVar.readShort();
        boolean z2 = t;
        if (s == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            w20.o(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(e25.g r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e25.A(e25$g, int):void");
    }

    public final void B(String str) {
        for (int i = 0; i < V.length; i++) {
            this.e[i].remove(str);
        }
    }

    public final void C(int i, String str, String str2) {
        HashMap<String, d>[] mapArr = this.e;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap<String, d> map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3 A[Catch: all -> 0x0103, Exception -> 0x0106, TryCatch #18 {Exception -> 0x0106, all -> 0x0103, blocks: (B:79:0x00ef, B:81:0x00f3, B:88:0x0111, B:87:0x0109), top: B:128:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109 A[Catch: all -> 0x0103, Exception -> 0x0106, TryCatch #18 {Exception -> 0x0106, all -> 0x0103, blocks: (B:79:0x00ef, B:81:0x00f3, B:88:0x0111, B:87:0x0109), top: B:128:0x00ef }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e25.D():void");
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            r40.h("Invalid marker");
            return;
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            r40.h("Invalid marker");
            return;
        }
        cVar.a(-40);
        String strC = c("Xmp");
        HashMap<String, d>[] mapArr = this.e;
        d dVarRemove = (strC == null || !this.s) ? null : mapArr[0].remove("Xmp");
        cVar.a(-1);
        cVar.a(-31);
        M(cVar);
        if (dVarRemove != null) {
            mapArr[0].put("Xmp", dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b2 = bVar.readByte();
            if (b2 == -39 || b2 == -38) {
                cVar.a(-1);
                cVar.a(b2);
                i25.d(bVar, cVar);
                return;
            }
            if (b2 != -31) {
                cVar.a(-1);
                cVar.a(b2);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.v(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    r40.h("Invalid length");
                    return;
                }
                while (i > 0) {
                    int i2 = bVar.read(bArr, 0, Math.min(i, 4096));
                    if (i2 >= 0) {
                        cVar.write(bArr, 0, i2);
                        i -= i2;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    r40.h("Invalid length");
                    return;
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, c0)) {
                        bVar.a(unsignedShort2 - 8);
                    }
                }
                cVar.a(-1);
                cVar.a(b2);
                cVar.v(unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = bVar.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 >= 0) {
                        cVar.write(bArr, 0, i4);
                        i3 -= i4;
                    }
                }
            }
        }
        r40.h("Invalid marker");
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        if (t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        i25.c(bVar, cVar, E.length);
        if (this.o == 0) {
            int i = bVar.readInt();
            cVar.h(i);
            i25.c(bVar, cVar, i + 8);
        } else {
            i25.c(bVar, cVar, (r2 - r7.length) - 8);
            bVar.a(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            M(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.h((int) crc32.getValue());
            i25.a(byteArrayOutputStream);
            i25.d(bVar, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            i25.a(byteArrayOutputStream2);
            throw th;
        }
    }

    public final void G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        int i2;
        int i3;
        int i4;
        ByteArrayOutputStream byteArrayOutputStream2;
        c cVar;
        byte[] bArr;
        boolean z2;
        if (t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar2 = new c(bufferedOutputStream, byteOrder);
        byte[] bArr2 = I;
        i25.c(bVar, cVar2, bArr2.length);
        byte[] bArr3 = J;
        bVar.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    c cVar3 = new c(byteArrayOutputStream4, byteOrder);
                    int i5 = this.o;
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    }
                    try {
                        if (i5 != 0) {
                            i25.c(bVar, cVar3, (i5 - ((bArr2.length + 4) + bArr3.length)) - 8);
                            bVar.a(4);
                            int i6 = bVar.readInt();
                            if (i6 % 2 != 0) {
                                i6++;
                            }
                            bVar.a(i6);
                            M(cVar3);
                        } else {
                            byte[] bArr4 = new byte[4];
                            bVar.readFully(bArr4);
                            byte[] bArr5 = M;
                            boolean zEquals = Arrays.equals(bArr4, bArr5);
                            byte[] bArr6 = O;
                            byte[] bArr7 = N;
                            if (!zEquals) {
                                if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                    int i7 = bVar.readInt();
                                    int i8 = i7 % 2 == 1 ? i7 + 1 : i7;
                                    byte[] bArr8 = new byte[3];
                                    boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                    boolean z3 = true;
                                    byte[] bArr9 = L;
                                    if (zEquals2) {
                                        bVar.readFully(bArr8);
                                        byte[] bArr10 = new byte[3];
                                        bVar.readFully(bArr10);
                                        if (!Arrays.equals(bArr9, bArr10)) {
                                            throw new IOException("Error checking VP8 signature");
                                        }
                                        i = bVar.readInt();
                                        i8 -= 10;
                                        i2 = (i << 18) >> 18;
                                        i3 = (i << 2) >> 18;
                                        z3 = false;
                                    } else if (!Arrays.equals(bArr4, bArr7)) {
                                        i = 0;
                                        i2 = 0;
                                        z3 = false;
                                        i3 = 0;
                                    } else {
                                        if (bVar.readByte() != 47) {
                                            throw new IOException("Error checking VP8L signature");
                                        }
                                        i = bVar.readInt();
                                        i2 = (i & 16383) + 1;
                                        i3 = ((i & 268419072) >>> 14) + 1;
                                        if ((i & 268435456) == 0) {
                                            z3 = false;
                                        }
                                        i8 -= 5;
                                    }
                                    cVar3.write(bArr5);
                                    cVar3.h(10);
                                    byte[] bArr11 = new byte[10];
                                    if (z3) {
                                        i4 = i2;
                                        bArr11[0] = (byte) (bArr11[0] | 16);
                                    } else {
                                        i4 = i2;
                                    }
                                    bArr11[0] = (byte) (bArr11[0] | 8);
                                    int i9 = i4 - 1;
                                    byteArrayOutputStream2 = byteArrayOutputStream4;
                                    int i10 = i3 - 1;
                                    cVar = cVar2;
                                    try {
                                        bArr11[4] = (byte) i9;
                                        bArr11[5] = (byte) (i9 >> 8);
                                        bArr11[6] = (byte) (i9 >> 16);
                                        bArr11[7] = (byte) i10;
                                        bArr11[8] = (byte) (i10 >> 8);
                                        bArr11[9] = (byte) (i10 >> 16);
                                        cVar3.write(bArr11);
                                        cVar3.write(bArr4);
                                        cVar3.h(i7);
                                        try {
                                            if (Arrays.equals(bArr4, bArr6)) {
                                                cVar3.write(bArr8);
                                                cVar3.write(bArr9);
                                                cVar3.h(i);
                                            } else {
                                                if (Arrays.equals(bArr4, bArr7)) {
                                                    cVar3.write(47);
                                                    cVar3.h(i);
                                                }
                                                i25.c(bVar, cVar3, i8);
                                                M(cVar3);
                                            }
                                            i25.c(bVar, cVar3, i8);
                                            M(cVar3);
                                        } catch (Exception e3) {
                                            e = e3;
                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                            i25.a(byteArrayOutputStream3);
                                            throw th;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                        throw new IOException("Failed to save WebP file", e);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream3 = byteArrayOutputStream;
                                        i25.a(byteArrayOutputStream3);
                                        throw th;
                                    }
                                }
                                i25.d(bVar, cVar3);
                                c cVar4 = cVar;
                                cVar4.h(byteArrayOutputStream2.size() + bArr3.length);
                                cVar4.write(bArr3);
                                byteArrayOutputStream = byteArrayOutputStream2;
                                byteArrayOutputStream.writeTo(cVar4);
                                i25.a(byteArrayOutputStream);
                                return;
                            }
                            int i11 = bVar.readInt();
                            byte[] bArr12 = new byte[i11 % 2 == 1 ? i11 + 1 : i11];
                            bVar.readFully(bArr12);
                            byte b2 = (byte) (8 | bArr12[0]);
                            bArr12[0] = b2;
                            boolean z4 = ((b2 >> 1) & 1) == 1;
                            cVar3.write(bArr5);
                            cVar3.h(i11);
                            cVar3.write(bArr12);
                            if (z4) {
                                byte[] bArr13 = P;
                                do {
                                    bArr = new byte[4];
                                    bVar.readFully(bArr);
                                    int i12 = bVar.readInt();
                                    cVar3.write(bArr);
                                    cVar3.h(i12);
                                    if (i12 % 2 == 1) {
                                        i12++;
                                    }
                                    i25.c(bVar, cVar3, i12);
                                } while (!Arrays.equals(bArr, bArr13));
                                while (true) {
                                    byte[] bArr14 = new byte[4];
                                    try {
                                        bVar.readFully(bArr14);
                                        z2 = !Arrays.equals(bArr14, Q);
                                    } catch (EOFException unused) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        break;
                                    }
                                    int i13 = bVar.readInt();
                                    cVar3.write(bArr14);
                                    cVar3.h(i13);
                                    if (i13 % 2 == 1) {
                                        i13++;
                                    }
                                    i25.c(bVar, cVar3, i13);
                                }
                                M(cVar3);
                            } else {
                                while (true) {
                                    byte[] bArr15 = new byte[4];
                                    bVar.readFully(bArr15);
                                    int i14 = bVar.readInt();
                                    cVar3.write(bArr15);
                                    cVar3.h(i14);
                                    if (i14 % 2 == 1) {
                                        i14++;
                                    }
                                    i25.c(bVar, cVar3, i14);
                                    if (Arrays.equals(bArr15, bArr6) || (bArr7 != null && Arrays.equals(bArr15, bArr7))) {
                                        break;
                                    }
                                }
                                M(cVar3);
                            }
                        }
                        byteArrayOutputStream.writeTo(cVar4);
                        i25.a(byteArrayOutputStream);
                        return;
                    } catch (Exception e5) {
                        e = e5;
                        byteArrayOutputStream3 = byteArrayOutputStream;
                        throw new IOException("Failed to save WebP file", e);
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream3 = byteArrayOutputStream;
                        i25.a(byteArrayOutputStream3);
                        throw th;
                    }
                    cVar = cVar2;
                    byteArrayOutputStream2 = byteArrayOutputStream4;
                    i25.d(bVar, cVar3);
                    c cVar42 = cVar;
                    cVar42.h(byteArrayOutputStream2.size() + bArr3.length);
                    cVar42.write(bArr3);
                    byteArrayOutputStream = byteArrayOutputStream2;
                } catch (Exception e6) {
                    e = e6;
                    byteArrayOutputStream = byteArrayOutputStream4;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream = byteArrayOutputStream4;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e25.H(java.lang.String, java.lang.String):void");
    }

    public final void I(b bVar) throws Throwable {
        String str;
        d dVar;
        int iH;
        HashMap<String, d> map = this.e[4];
        d dVar2 = map.get("Compression");
        if (dVar2 == null) {
            this.n = 6;
            s(bVar, map);
            return;
        }
        int iH2 = dVar2.h(this.g);
        this.n = iH2;
        int i = 1;
        if (iH2 != 1) {
            if (iH2 == 6) {
                s(bVar, map);
                return;
            } else if (iH2 != 7) {
                return;
            }
        }
        d dVar3 = map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.g);
            int[] iArr2 = w;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (dVar = map.get("PhotometricInterpretation")) != null && (((iH = dVar.h(this.g)) == 1 && Arrays.equals(iArr, x)) || (iH == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = map.get("StripOffsets");
                d dVar5 = map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrB = i25.b(dVar4.j(this.g));
                long[] jArrB2 = i25.b(dVar5.j(this.g));
                if (jArrB == null || jArrB.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrB2 == null || jArrB2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrB.length != jArrB2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrB2) {
                    j += j2;
                }
                int i2 = (int) j;
                byte[] bArr = new byte[i2];
                this.j = true;
                this.i = true;
                this.h = true;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < jArrB.length) {
                    int i6 = (int) jArrB[i3];
                    int i7 = (int) jArrB2[i3];
                    if (i3 < jArrB.length - i) {
                        str = str2;
                        if (i6 + i7 != jArrB[i3 + 1]) {
                            this.j = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i8 = i6 - i4;
                    if (i8 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.a(i8);
                        int i9 = i4 + i8;
                        byte[] bArr2 = new byte[i7];
                        try {
                            bVar.readFully(bArr2);
                            i4 = i9 + i7;
                            System.arraycopy(bArr2, 0, bArr, i5, i7);
                            i5 += i7;
                            i3++;
                            str2 = str3;
                            i = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i7 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i8 + " bytes.");
                        return;
                    }
                }
                this.m = bArr;
                if (this.j) {
                    this.k = (int) jArrB[0];
                    this.l = i2;
                    return;
                }
                return;
            }
        }
        if (t) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void J(int i, int i2) throws Throwable {
        HashMap<String, d>[] mapArr = this.e;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = t;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = mapArr[i].get("ImageLength");
        d dVar2 = mapArr[i].get("ImageWidth");
        d dVar3 = mapArr[i2].get("ImageLength");
        d dVar4 = mapArr[i2].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iH = dVar.h(this.g);
        int iH2 = dVar2.h(this.g);
        int iH3 = dVar3.h(this.g);
        int iH4 = dVar4.h(this.g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap<String, d> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void K(g gVar, int i) throws Throwable {
        d dVarE;
        d dVarE2;
        HashMap<String, d>[] mapArr = this.e;
        d dVar = mapArr[i].get("DefaultCropSize");
        d dVar2 = mapArr[i].get("SensorTopBorder");
        d dVar3 = mapArr[i].get("SensorLeftBorder");
        d dVar4 = mapArr[i].get("SensorBottomBorder");
        d dVar5 = mapArr[i].get("SensorRightBorder");
        if (dVar != null) {
            int i2 = dVar.a;
            ByteOrder byteOrder = this.g;
            if (i2 == 5) {
                f[] fVarArr = (f[]) dVar.j(byteOrder);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarE = d.d(new f[]{fVarArr[0]}, this.g);
                    dVarE2 = d.d(new f[]{fVarArr[1]}, this.g);
                }
            } else {
                int[] iArr = (int[]) dVar.j(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarE = d.e(iArr[0], this.g);
                dVarE2 = d.e(iArr[1], this.g);
            }
            mapArr[i].put("ImageWidth", dVarE);
            mapArr[i].put("ImageLength", dVarE2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int iH = dVar2.h(this.g);
            int iH2 = dVar4.h(this.g);
            int iH3 = dVar5.h(this.g);
            int iH4 = dVar3.h(this.g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            d dVarE3 = d.e(iH2 - iH, this.g);
            d dVarE4 = d.e(iH3 - iH4, this.g);
            mapArr[i].put("ImageLength", dVarE3);
            mapArr[i].put("ImageWidth", dVarE4);
            return;
        }
        d dVar6 = mapArr[i].get("ImageLength");
        d dVar7 = mapArr[i].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = mapArr[i].get("JPEGInterchangeFormat");
            d dVar9 = mapArr[i].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int iH5 = dVar8.h(this.g);
            int iH6 = dVar8.h(this.g);
            gVar.h(iH5);
            byte[] bArr = new byte[iH6];
            gVar.readFully(bArr);
            g(new b(bArr), iH5, i);
        }
    }

    public final void L() throws Throwable {
        J(0, 5);
        J(0, 4);
        J(5, 4);
        HashMap<String, d>[] mapArr = this.e;
        d dVar = mapArr[1].get("PixelXDimension");
        d dVar2 = mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && u(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!u(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        C(0, "ThumbnailOrientation", "Orientation");
        C(0, "ThumbnailImageLength", "ImageLength");
        C(0, "ThumbnailImageWidth", "ImageWidth");
        C(5, "ThumbnailOrientation", "Orientation");
        C(5, "ThumbnailImageLength", "ImageLength");
        C(5, "ThumbnailImageWidth", "ImageWidth");
        C(4, "Orientation", "ThumbnailOrientation");
        C(4, "ImageLength", "ThumbnailImageLength");
        C(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void M(c cVar) throws IOException {
        HashMap<String, d>[] mapArr;
        char c2;
        char c3;
        int i;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        e[][] eVarArr = V;
        int[] iArr4 = new int[eVarArr.length];
        int[] iArr5 = new int[eVarArr.length];
        e[] eVarArr2 = W;
        for (e eVar : eVarArr2) {
            B(eVar.b);
        }
        if (this.h) {
            if (this.i) {
                B("StripOffsets");
                B("StripByteCounts");
            } else {
                B("JPEGInterchangeFormat");
                B("JPEGInterchangeFormatLength");
            }
        }
        int i2 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.e;
            if (i2 >= length) {
                break;
            }
            Object[] array = mapArr[i2].entrySet().toArray();
            int length2 = array.length;
            int i3 = 0;
            while (i3 < length2) {
                Map.Entry entry = (Map.Entry) array[i3];
                if (entry.getValue() == null) {
                    iArr3 = iArr4;
                    mapArr[i2].remove(entry.getKey());
                } else {
                    iArr3 = iArr4;
                }
                i3++;
                iArr4 = iArr3;
            }
            i2++;
        }
        int[] iArr6 = iArr4;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(eVarArr2[1].b, d.b(0L, this.g));
        }
        if (mapArr[2].isEmpty()) {
            c2 = 2;
        } else {
            c2 = 2;
            mapArr[0].put(eVarArr2[2].b, d.b(0L, this.g));
        }
        if (mapArr[3].isEmpty()) {
            c3 = 3;
        } else {
            c3 = 3;
            mapArr[1].put(eVarArr2[3].b, d.b(0L, this.g));
        }
        if (!this.h) {
            i = 1;
            iArr = iArr5;
        } else if (this.i) {
            mapArr[4].put("StripOffsets", d.e(0, this.g));
            mapArr[4].put("StripByteCounts", d.e(this.l, this.g));
            i = 1;
            iArr = iArr5;
        } else {
            mapArr[4].put("JPEGInterchangeFormat", d.b(0L, this.g));
            i = 1;
            iArr = iArr5;
            mapArr[4].put("JPEGInterchangeFormatLength", d.b(this.l, this.g));
        }
        int i4 = 0;
        while (true) {
            int length3 = eVarArr.length;
            iArr2 = S;
            if (i4 >= length3) {
                break;
            }
            Iterator<Map.Entry<String, d>> it = mapArr[i4].entrySet().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                d value = it.next().getValue();
                value.getClass();
                int i6 = iArr2[value.a] * value.b;
                if (i6 > 4) {
                    i5 += i6;
                }
            }
            iArr[i4] = iArr[i4] + i5;
            i4++;
        }
        int size = 8;
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            if (!mapArr[i7].isEmpty()) {
                iArr6[i7] = size;
                size = (mapArr[i7].size() * 12) + 6 + iArr[i7] + size;
            }
        }
        if (this.h) {
            if (this.i) {
                mapArr[4].put("StripOffsets", d.e(size, this.g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.b(size, this.g));
            }
            this.k = size;
            size += this.l;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (t) {
            for (int i8 = 0; i8 < eVarArr.length; i8++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i8), Integer.valueOf(iArr6[i8]), Integer.valueOf(mapArr[i8].size()), Integer.valueOf(iArr[i8]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i].isEmpty()) {
            mapArr[0].put(eVarArr2[i].b, d.b(iArr6[i], this.g));
        }
        if (!mapArr[c2].isEmpty()) {
            mapArr[0].put(eVarArr2[c2].b, d.b(iArr6[c2], this.g));
        }
        if (!mapArr[c3].isEmpty()) {
            mapArr[i].put(eVarArr2[c3].b, d.b(iArr6[c3], this.g));
        }
        int i9 = this.d;
        if (i9 != 4) {
            if (i9 == 13) {
                cVar.h(size);
                cVar.write(F);
            } else if (i9 == 14) {
                cVar.write(K);
                cVar.h(size);
            }
        } else if (size > 65535) {
            r6.g(bg.d(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            return;
        } else {
            cVar.v(size);
            cVar.write(c0);
        }
        cVar.p(this.g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.b = this.g;
        cVar.v(42);
        cVar.s(8L);
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            if (!mapArr[i10].isEmpty()) {
                cVar.v(mapArr[i10].size());
                int size2 = (mapArr[i10].size() * 12) + iArr6[i10] + 2 + 4;
                for (Map.Entry<String, d> entry2 : mapArr[i10].entrySet()) {
                    int i11 = Y[i10].get(entry2.getKey()).a;
                    d value2 = entry2.getValue();
                    value2.getClass();
                    int i12 = value2.b;
                    int i13 = value2.a;
                    int i14 = iArr2[i13] * i12;
                    cVar.v(i11);
                    cVar.v(i13);
                    cVar.h(i12);
                    if (i14 > 4) {
                        cVar.s(size2);
                        size2 += i14;
                    } else {
                        cVar.write(value2.d);
                        if (i14 < 4) {
                            while (i14 < 4) {
                                cVar.a(0);
                                i14++;
                            }
                        }
                    }
                }
                if (i10 != 0 || mapArr[4].isEmpty()) {
                    cVar.s(0L);
                } else {
                    cVar.s(iArr6[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = mapArr[i10].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            cVar.write(p());
        }
        if (this.d == 14 && size % 2 == i) {
            cVar.a(0);
        }
        cVar.b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap<String, d>[] mapArr = this.e;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", d.a(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.b(0L, this.g));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.b(0L, this.g));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", d.b(0L, this.g));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", d.b(0L, this.g));
        }
    }

    public final String c(String str) {
        if (str == null) {
            ja.k("tag shouldn't be null");
            return null;
        }
        d dVarE = e(str);
        if (dVarE != null) {
            int i = dVarE.a;
            if (!Z.contains(str)) {
                return dVarE.i(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                f[] fVarArr = (f[]) dVarE.j(this.g);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.a / fVar.b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.a / fVar2.b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.a / fVar3.b)));
            }
            try {
                return Double.toString(dVarE.g(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        if (str == null) {
            ja.k("tag shouldn't be null");
            return 0;
        }
        d dVarE = e(str);
        if (dVarE != null) {
            try {
                return dVarE.h(this.g);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final d e(String str) {
        if (str == null) {
            ja.k("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (t) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < V.length; i++) {
            d dVar = this.e[i].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void f(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            b0.u("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i25.b.a(mediaMetadataRetriever, new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, d>[] mapArr = this.e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.e(Integer.parseInt(strExtractMetadata), this.g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", d.e(Integer.parseInt(strExtractMetadata2), this.g));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", d.e(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata4);
                    int i3 = Integer.parseInt(strExtractMetadata5);
                    if (i3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.h(i2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i4 = i2 + 6;
                    int i5 = i3 - 6;
                    if (!Arrays.equals(bArr, c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i5];
                    gVar.readFully(bArr2);
                    this.o = i4;
                    z(0, bArr2);
                }
                if (t) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void g(e25.b r24, int r25, int r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e25.g(e25$b, int, int):void");
    }

    public final double[] h() {
        String strC = c("GPSLatitude");
        String strC2 = c("GPSLatitudeRef");
        String strC3 = c("GPSLongitude");
        String strC4 = c("GPSLongitudeRef");
        if (strC == null || strC2 == null || strC3 == null || strC4 == null) {
            return null;
        }
        try {
            return new double[]{b(strC, strC2), b(strC3, strC4)};
        } catch (IllegalArgumentException unused) {
            StringBuilder sbF = u40.f("latValue=", strC, ", latRef=", strC2, ", lngValue=");
            sbF.append(strC3);
            sbF.append(", lngRef=");
            sbF.append(strC4);
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(sbF.toString()));
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(3:150|13|(2:151|14))|(16:17|(2:19|(1:21))(1:26)|27|(1:29)|30|(1:32)(13:33|(7:155|37|38|(2:40|178)(5:41|153|42|(1:44)(2:45|(1:47))|(1:180)(3:177|50|51))|52|34|35)|176|55|56|164|66|162|67|68|(1:74)(1:73)|75|(1:88)(8:159|90|157|91|92|(1:94)(1:95)|96|(1:108)(3:110|(2:111|(2:113|(2:171|115)(1:116))(2:170|117))|(1:119)(4:121|(2:122|(2:124|(1:173)(1:127))(3:172|128|(2:129|(1:174)(2:131|(1:175)(1:134)))))|126|(1:136)(1:138)))))|61|(1:63)|(1:56)|164|66|162|67|68|(3:70|74|75)(0)|(0)(0))|16|164|66|162|67|68|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f9, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fb, code lost:
    
        if (r4 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fd, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0100, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0101, code lost:
    
        if (r3 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0106, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(java.io.BufferedInputStream r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e25.i(java.io.BufferedInputStream):int");
    }

    public final void j(g gVar) throws Throwable {
        int i;
        int i2;
        m(gVar);
        HashMap<String, d>[] mapArr = this.e;
        d dVar = mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.d);
            gVar2.c = this.g;
            byte[] bArr = C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.h(0L);
            byte[] bArr3 = D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.h(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.h(12L);
            }
            A(gVar2, 6);
            d dVar2 = mapArr[7].get("PreviewImageStart");
            d dVar3 = mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                d dVarE = d.e(i5, this.g);
                d dVarE2 = d.e(i6, this.g);
                mapArr[0].put("ImageWidth", dVarE);
                mapArr[0].put("ImageLength", dVarE2);
            }
        }
    }

    public final void k(b bVar) throws Throwable {
        if (t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, H)) {
                    return;
                }
                if (Arrays.equals(bArr2, F)) {
                    byte[] bArr3 = new byte[i];
                    bVar.readFully(bArr3);
                    int i3 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.o = i2;
                        z(0, bArr3);
                        L();
                        I(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                bVar.a(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                r40.h("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void l(b bVar) throws Throwable {
        boolean z2 = t;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.a(i - bVar.b);
        bVar.readFully(bArr4);
        g(new b(bArr4), i, 5);
        bVar.a(i3 - bVar.b);
        bVar.c = ByteOrder.BIG_ENDIAN;
        int i4 = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == U.a) {
                short s = bVar.readShort();
                short s2 = bVar.readShort();
                d dVarE = d.e(s, this.g);
                d dVarE2 = d.e(s2, this.g);
                HashMap<String, d>[] mapArr = this.e;
                mapArr[0].put("ImageLength", dVarE);
                mapArr[0].put("ImageWidth", dVarE2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void m(g gVar) throws Throwable {
        w(gVar);
        A(gVar, 0);
        K(gVar, 0);
        K(gVar, 5);
        K(gVar, 4);
        L();
        if (this.d == 8) {
            HashMap<String, d>[] mapArr = this.e;
            d dVar = mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.d);
                gVar2.c = this.g;
                gVar2.a(6);
                A(gVar2, 9);
                d dVar2 = mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final int n() {
        switch (d(1, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void o(g gVar) throws Throwable {
        if (t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m(gVar);
        HashMap<String, d>[] mapArr = this.e;
        d dVar = mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.d), (int) dVar.c, 5);
        }
        d dVar2 = mapArr[0].get("ISO");
        d dVar3 = mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] p() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing fd."
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10.h
            r4 = 0
            if (r3 != 0) goto Ld
            goto L99
        Ld:
            byte[] r3 = r10.m
            if (r3 == 0) goto L12
            return r3
        L12:
            android.content.res.AssetManager$AssetInputStream r3 = r10.c     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r3 == 0) goto L33
            boolean r5 = r3.markSupported()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            if (r5 == 0) goto L2a
            r3.reset()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
        L1f:
            r5 = r4
            goto L5b
        L21:
            r10 = move-exception
            r5 = r4
        L23:
            r4 = r3
            goto L9a
        L26:
            r10 = move-exception
            r5 = r4
            goto L88
        L2a:
            java.lang.String r10 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r2, r10)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            defpackage.i25.a(r3)
            return r4
        L33:
            java.lang.String r3 = r10.a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            if (r3 == 0) goto L46
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.lang.String r5 = r10.a     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            goto L1f
        L3f:
            r10 = move-exception
            r5 = r4
            goto L9a
        L42:
            r10 = move-exception
            r3 = r4
            r5 = r3
            goto L88
        L46:
            java.io.FileDescriptor r3 = r10.b     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            java.io.FileDescriptor r3 = i25.a.b(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L42
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            r6 = 0
            i25.a.c(r3, r6, r5)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L85
            r9 = r5
            r5 = r3
            r3 = r9
        L5b:
            e25$b r6 = new e25$b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r7 = r10.k     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r8 = r10.o     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r7 = r7 + r8
            r6.a(r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            int r7 = r10.l     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r6.readFully(r7)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            r10.m = r7     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80
            defpackage.i25.a(r3)
            if (r5 == 0) goto L7d
            i25.a.a(r5)     // Catch: java.lang.Exception -> L7a
            return r7
        L7a:
            android.util.Log.e(r1, r0)
        L7d:
            return r7
        L7e:
            r10 = move-exception
            goto L23
        L80:
            r10 = move-exception
            goto L88
        L82:
            r10 = move-exception
            r5 = r3
            goto L9a
        L85:
            r10 = move-exception
            r5 = r3
            r3 = r4
        L88:
            java.lang.String r6 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r2, r6, r10)     // Catch: java.lang.Throwable -> L7e
            defpackage.i25.a(r3)
            if (r5 == 0) goto L99
            i25.a.a(r5)     // Catch: java.lang.Exception -> L96
            goto L99
        L96:
            android.util.Log.e(r1, r0)
        L99:
            return r4
        L9a:
            defpackage.i25.a(r4)
            if (r5 == 0) goto La6
            i25.a.a(r5)     // Catch: java.lang.Exception -> La3
            goto La6
        La3:
            android.util.Log.e(r1, r0)
        La6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e25.p():byte[]");
    }

    public final void q(b bVar) throws Throwable {
        if (t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(I.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = J;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i2 = bVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    bVar.readFully(bArr3);
                    this.o = i3;
                    z(0, bArr3);
                    I(new b(bArr3));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i2);
            } catch (EOFException unused) {
                r40.h("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void s(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iH = dVar.h(this.g);
        int iH2 = dVar2.h(this.g);
        if (this.d == 7) {
            iH += this.p;
        }
        if (iH > 0 && iH2 > 0) {
            this.h = true;
            if (this.a == null && this.c == null && this.b == null) {
                byte[] bArr = new byte[iH2];
                bVar.a(iH);
                bVar.readFully(bArr);
                this.m = bArr;
            }
            this.k = iH;
            this.l = iH2;
        }
        if (t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iH + ", length: " + iH2);
        }
    }

    public final void t(String str) throws Throwable {
        boolean z2;
        if (str == null) {
            ja.k("filename cannot be null");
            return;
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    i25.a.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z2 = true;
                } catch (Exception unused) {
                    if (t) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z2 = false;
                }
                if (z2) {
                    this.b = fileInputStream2.getFD();
                } else {
                    this.b = null;
                }
                v(fileInputStream2);
                i25.a(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                i25.a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean u(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.g) <= 512 && dVar2.h(this.g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:14:0x0020, B:20:0x003d, B:22:0x0048, B:30:0x005e, B:25:0x004f, B:28:0x0057, B:29:0x005b, B:31:0x0068, B:33:0x0071, B:35:0x0077, B:37:0x007d, B:39:0x0083, B:45:0x0091), top: B:57:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.e25.t
            if (r8 == 0) goto Lab
            r1 = 0
            r2 = r1
        L6:
            e25$e[][] r3 = defpackage.e25.V     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r3 = r3.length     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 >= r3) goto L20
            java.util.HashMap<java.lang.String, e25$d>[] r3 = r7.e     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r4.<init>()     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3[r2] = r4     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r2 + 1
            goto L6
        L17:
            r8 = move-exception
            goto L99
        L1a:
            r8 = move-exception
            goto L8f
        L1d:
            r8 = move-exception
            goto L8f
        L20:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r8 = r7.i(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.d = r8     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L68
            if (r8 == r5) goto L68
            if (r8 == r4) goto L68
            if (r8 != r3) goto L3d
            goto L68
        L3d:
            e25$g r8 = new e25$g     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r1 = r7.d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r2 = 12
            if (r1 != r2) goto L4c
            r7.f(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L4c:
            r2 = 7
            if (r1 != r2) goto L53
            r7.j(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L53:
            r2 = 10
            if (r1 != r2) goto L5b
            r7.o(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L5e
        L5b:
            r7.m(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L5e:
            int r1 = r7.o     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.h(r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r7.I(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L68:
            e25$b r8 = new e25$b     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            int r2 = r7.d     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            if (r2 != r6) goto L75
            r7.g(r8, r1, r1)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L75:
            if (r2 != r4) goto L7b
            r7.k(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L7b:
            if (r2 != r5) goto L81
            r7.l(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
            goto L86
        L81:
            if (r2 != r3) goto L86
            r7.q(r8)     // Catch: java.lang.Throwable -> L17 java.lang.UnsupportedOperationException -> L1a java.io.IOException -> L1d
        L86:
            r7.a()
            if (r0 == 0) goto Laa
            r7.x()
            return
        L8f:
            if (r0 == 0) goto La2
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L17
            goto La2
        L99:
            r7.a()
            if (r0 == 0) goto La1
            r7.x()
        La1:
            throw r8
        La2:
            r7.a()
            if (r0 == 0) goto Laa
            r7.x()
        Laa:
            return
        Lab:
            java.lang.String r7 = "inputstream shouldn't be null"
            defpackage.ja.k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e25.v(java.io.InputStream):void");
    }

    public final void w(g gVar) throws IOException {
        ByteOrder byteOrderY = y(gVar);
        this.g = byteOrderY;
        gVar.c = byteOrderY;
        int unsignedShort = gVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            w20.o(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = gVar.readInt();
        if (i2 < 8) {
            r40.h(p6.c(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            gVar.a(i3);
        }
    }

    public final void x() {
        int i = 0;
        while (true) {
            HashMap<String, d>[] mapArr = this.e;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbG = o6.g(i, "The size of tag group[", "]: ");
            sbG.append(mapArr[i].size());
            Log.d("ExifInterface", sbG.toString());
            for (Map.Entry<String, d> entry : mapArr[i].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.i(this.g) + "'");
            }
            i++;
        }
    }

    public final void z(int i, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        w(gVar);
        A(gVar, i);
    }

    public static class c extends FilterOutputStream {
        public final OutputStream a;
        public ByteOrder b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.a = outputStream;
            this.b = byteOrder;
        }

        public final void a(int i) throws IOException {
            this.a.write(i);
        }

        public final void h(int i) throws IOException {
            ByteOrder byteOrder = this.b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.a;
            if (byteOrder == byteOrder2) {
                outputStream.write(i & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i >>> 24) & 255);
                outputStream.write((i >>> 16) & 255);
                outputStream.write((i >>> 8) & 255);
                outputStream.write(i & 255);
            }
        }

        public final void p(short s) throws IOException {
            ByteOrder byteOrder = this.b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.a;
            if (byteOrder == byteOrder2) {
                outputStream.write(s & 255);
                outputStream.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s >>> 8) & 255);
                outputStream.write(s & 255);
            }
        }

        public final void s(long j) throws IOException {
            if (j <= 4294967295L) {
                h((int) j);
            } else {
                l5.q("val is larger than the maximum value of a 32-bit unsigned integer");
            }
        }

        public final void v(int i) throws IOException {
            if (i <= 65535) {
                p((short) i);
            } else {
                l5.q("val is larger than the maximum value of a 16-bit unsigned integer");
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.a.write(bArr, i, i2);
        }
    }

    public static class b extends InputStream implements DataInput {
        public final DataInputStream a;
        public int b;
        public ByteOrder c;
        public byte[] d;
        public final int e;

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.a = dataInputStream;
            dataInputStream.mark(0);
            this.b = 0;
            this.c = byteOrder;
            this.e = inputStream instanceof b ? ((b) inputStream).e : -1;
        }

        public final void a(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                DataInputStream dataInputStream = this.a;
                int iSkip = (int) dataInputStream.skip(i3);
                if (iSkip <= 0) {
                    if (this.d == null) {
                        this.d = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.d, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException(bg.d(i, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i2 += iSkip;
            }
            this.b += i2;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.a.available();
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.b++;
            return this.a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.b++;
            return this.a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.b++;
            int i = this.a.read();
            if (i >= 0) {
                return (byte) i;
            }
            k20.n();
            return (byte) 0;
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.b += 2;
            return this.a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.b += bArr.length;
            this.a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.b += 4;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            if ((i | i2 | i3 | i4) < 0) {
                k20.n();
                return 0;
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            w20.o(this.c, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.b += 8;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                k20.n();
                return 0L;
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            w20.o(this.c, "Invalid byte order: ");
            return 0L;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.b += 2;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                k20.n();
                return (short) 0;
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i << 8) + i2);
            }
            w20.o(this.c, "Invalid byte order: ");
            return (short) 0;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.b += 2;
            return this.a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.b++;
            return this.a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.b += 2;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                k20.n();
                return 0;
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i2 << 8) + i;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i << 8) + i2;
            }
            w20.o(this.c, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.b += i2;
            this.a.readFully(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.a.read(bArr, i, i2);
            this.b += i3;
            return i3;
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.e = bArr.length;
        }
    }

    public static class d {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public d(long j, byte[] bArr, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(e25.b0);
            return new d(2, bytes, bytes.length);
        }

        public static d b(long j, ByteOrder byteOrder) {
            return c(new long[]{j}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[e25.S[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new d(4, byteBufferWrap.array(), jArr.length);
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[e25.S[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.a);
                byteBufferWrap.putInt((int) fVar.b);
            }
            return new d(5, byteBufferWrap.array(), fVarArr.length);
        }

        public static d e(int i, ByteOrder byteOrder) {
            return f(new int[]{i}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[e25.S[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new d(3, byteBufferWrap.array(), iArr.length);
        }

        public final double g(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objJ instanceof String) {
                return Double.parseDouble((String) objJ);
            }
            if (objJ instanceof long[]) {
                if (((long[]) objJ).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof int[]) {
                if (((int[]) objJ).length == 1) {
                    return r3[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objJ;
            if (fVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            f fVar = fVarArr[0];
            return fVar.a / fVar.b;
        }

        public final int h(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objJ instanceof String) {
                return Integer.parseInt((String) objJ);
            }
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                return null;
            }
            if (objJ instanceof String) {
                return (String) objJ;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objJ instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objJ;
            while (i < fVarArr.length) {
                sb.append(fVarArr[i].a);
                sb.append('/');
                sb.append(fVarArr[i].b);
                i++;
                if (i != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
        /* JADX WARN: Type inference failed for: r13v16, types: [e25$f[]] */
        /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v19, types: [e25$f[]] */
        /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
        /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.io.Serializable j(java.nio.ByteOrder r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e25.d.j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(e25.R[this.a]);
            sb.append(", data length:");
            return w20.k(sb, this.d.length, ")");
        }

        public d(int i, byte[] bArr, int i2) {
            this(-1L, bArr, i, i2);
        }
    }

    public static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public e(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public e(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public static class g extends b {
        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.a.mark(Integer.MAX_VALUE);
            } else {
                l5.q("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
                throw null;
            }
        }

        public final void h(long j) throws IOException {
            int i = this.b;
            if (i > j) {
                this.b = 0;
                this.a.reset();
            } else {
                j -= (long) i;
            }
            a((int) j);
        }

        public g(byte[] bArr) {
            super(bArr);
            this.a.mark(Integer.MAX_VALUE);
        }
    }

    public e25(String str) throws Throwable {
        e[][] eVarArr = V;
        this.e = new HashMap[eVarArr.length];
        this.f = new HashSet(eVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            t(str);
        } else {
            ja.k("filename cannot be null");
            throw null;
        }
    }

    public e25(File file) throws Throwable {
        e[][] eVarArr = V;
        this.e = new HashMap[eVarArr.length];
        this.f = new HashSet(eVarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            t(file.getAbsolutePath());
        } else {
            ja.k("file cannot be null");
            throw null;
        }
    }
}
