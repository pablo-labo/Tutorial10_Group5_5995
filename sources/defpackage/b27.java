package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class b27 {
    public static final a a = new a();

    public static final class a implements Iterable<Pair<? extends String, ? extends String>>, ze8 {
        public final Map<String, List<String>> a = lc9.a0(new Pair("string", u63.a0("Artist", "CFAPattern", "ComponentsConfiguration", "Copyright", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "DeviceSettingDescription", "ExifVersion", "FileSource", "FlashpixVersion", "GPSAreaInformation", "GPSDateStamp", "GPSDestBearingRef", "GPSDestDistanceRef", "GPSDestLatitudeRef", "GPSDestLongitudeRef", "GPSHPositioningError", "GPSImgDirectionRef", "GPSLatitudeRef", "GPSLongitudeRef", "GPSMapDatum", "GPSMeasureMode", "GPSProcessingMethod", "GPSSatellites", "GPSSpeedRef", "GPSStatus", "GPSTimeStamp", "GPSTrackRef", "GPSVersionID", "ImageDescription", "ImageUniqueID", "InteroperabilityIndex", "Make", "MakerNote", "Model", "OECF", "RelatedSoundFile", "SceneType", "Software", "SpatialFrequencyResponse", "SpectralSensitivity", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "UserComment")), new Pair("double", u63.a0("ApertureValue", "BrightnessValue", "CompressedBitsPerPixel", "DigitalZoomRatio", "ExposureBiasValue", "ExposureIndex", "ExposureTime", "FlashEnergy", "FocalLength", "FocalPlaneXResolution", "FocalPlaneYResolution", "FNumber", "GPSAltitude", "GPSDestBearing", "GPSDestDistance", "GPSDestLatitude", "GPSDestLongitude", "GPSDOP", "GPSImgDirection", "GPSLatitude", "GPSLongitude", "GPSSpeed", "GPSTrack", "MaxApertureValue", "PrimaryChromaticities", "ReferenceBlackWhite", "ShutterSpeedValue", "SubjectDistance", "WhitePoint", "XResolution", "YCbCrCoefficients", "YResolution")), new Pair("int", u63.a0("BitsPerSample", "ColorSpace", "Compression", "Contrast", "CustomRendered", "DefaultCropSize", "DNGVersion", "ExposureMode", "ExposureProgram", "Flash", "FocalLengthIn35mmFilm", "FocalPlaneResolutionUnit", "GainControl", "GPSAltitudeRef", "GPSDifferential", "ImageLength", "ImageWidth", "ISOSpeedRatings", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "LightSource", "MeteringMode", "NewSubfileType", "AspectFrame", "PreviewImageLength", "PreviewImageStart", "Orientation", "PhotometricInterpretation", "PixelXDimension", "PixelYDimension", "PlanarConfiguration", "ResolutionUnit", "RowsPerStrip", "ISO", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "SamplesPerPixel", "Saturation", "SceneCaptureType", "SensingMethod", "Sharpness", "StripByteCounts", "StripOffsets", "SubfileType", "SubjectArea", "SubjectDistanceRange", "SubjectLocation", "ThumbnailImageLength", "ThumbnailImageWidth", "TransferFunction", "WhiteBalance", "YCbCrPositioning", "YCbCrSubSampling")));

        @Override // java.lang.Iterable
        public final Iterator<Pair<? extends String, ? extends String>> iterator() {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : this.a.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                ArrayList arrayList2 = new ArrayList(t92.r0(value, 10));
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Pair(key, (String) it.next()));
                }
                w92.w0(arrayList, arrayList2);
            }
            return arrayList.iterator();
        }
    }
}
