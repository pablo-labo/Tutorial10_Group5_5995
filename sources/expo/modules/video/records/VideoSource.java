package expo.modules.video.records;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.datasource.a;
import androidx.media3.datasource.c;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.source.d;
import androidx.media3.exoplayer.source.h;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.ef3;
import defpackage.ftc;
import defpackage.gb;
import defpackage.gf3;
import defpackage.ia;
import defpackage.ij9;
import defpackage.in3;
import defpackage.ka2;
import defpackage.od2;
import defpackage.oj9;
import defpackage.qyc;
import defpackage.w85;
import defpackage.yng;
import defpackage.z92;
import expo.modules.video.UnsupportedDRMTypeException;
import expo.modules.video.enums.ContentType;
import expo.modules.video.enums.DRMType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010%\u0012\u0004\b*\u0010$\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010+\u0012\u0004\b0\u0010$\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R6\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u00101\u0012\u0004\b6\u0010$\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u00107\u0012\u0004\b<\u0010$\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b@\u0010$\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lexpo/modules/video/records/VideoSource;", "Lftc;", "Ljava/io/Serializable;", "Landroid/net/Uri;", "uri", "Lexpo/modules/video/records/DRMOptions;", "drm", "Lexpo/modules/video/records/VideoMetadata;", "metadata", "", "", "headers", "", "useCaching", "Lexpo/modules/video/enums/ContentType;", "contentType", "<init>", "(Landroid/net/Uri;Lexpo/modules/video/records/DRMOptions;Lexpo/modules/video/records/VideoMetadata;Ljava/util/Map;ZLexpo/modules/video/enums/ContentType;)V", "toMediaId", "()Ljava/lang/String;", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "parseLocalAssetId", "(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;", "Landroidx/media3/exoplayer/source/h;", "toMediaSource", "(Landroid/content/Context;)Landroidx/media3/exoplayer/source/h;", "Lij9;", "toMediaItem", "(Landroid/content/Context;)Lij9;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "getUri$annotations", "()V", "Lexpo/modules/video/records/DRMOptions;", "getDrm", "()Lexpo/modules/video/records/DRMOptions;", "setDrm", "(Lexpo/modules/video/records/DRMOptions;)V", "getDrm$annotations", "Lexpo/modules/video/records/VideoMetadata;", "getMetadata", "()Lexpo/modules/video/records/VideoMetadata;", "setMetadata", "(Lexpo/modules/video/records/VideoMetadata;)V", "getMetadata$annotations", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getHeaders$annotations", "Z", "getUseCaching", "()Z", "setUseCaching", "(Z)V", "getUseCaching$annotations", "Lexpo/modules/video/enums/ContentType;", "getContentType", "()Lexpo/modules/video/enums/ContentType;", "getContentType$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoSource implements ftc, Serializable {
    private final ContentType contentType;
    private DRMOptions drm;
    private Map<String, String> headers;
    private VideoMetadata metadata;
    private Uri uri;
    private boolean useCaching;

    public /* synthetic */ VideoSource(Uri uri, DRMOptions dRMOptions, VideoMetadata videoMetadata, Map map, boolean z, ContentType contentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uri, (i & 2) != 0 ? null : dRMOptions, (i & 4) != 0 ? null : videoMetadata, (i & 8) != 0 ? null : map, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ContentType.AUTO : contentType);
    }

    @w85
    public static /* synthetic */ void getContentType$annotations() {
    }

    @w85
    public static /* synthetic */ void getDrm$annotations() {
    }

    @w85
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @w85
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @w85
    public static /* synthetic */ void getUri$annotations() {
    }

    @w85
    public static /* synthetic */ void getUseCaching$annotations() {
    }

    @SuppressLint({"DiscouragedApi"})
    private final Uri parseLocalAssetId(Uri uri, Context context) {
        if (uri != null && uri.getScheme() == null) {
            try {
                gf3 gf3Var = new gf3(new Uri.Builder().scheme("android.resource").appendPath(String.valueOf(context.getResources().getIdentifier(uri.toString(), "raw", context.getPackageName()))).build());
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                rawResourceDataSource.b(gf3Var);
                return rawResourceDataSource.a();
            } catch (RawResourceDataSource.RawResourceDataSourceException e) {
                Log.e("ExpoVideo", "Error parsing local asset id, falling back to original uri", e);
            }
        }
        return uri;
    }

    private final String toMediaId() {
        Uri artwork;
        Map<String, String> headers;
        Collection<String> collectionValues;
        Map<String, String> headers2;
        Set<String> setKeySet;
        Uri uri = this.uri;
        Map<String, String> map = this.headers;
        DRMOptions dRMOptions = this.drm;
        String path = null;
        DRMType type = dRMOptions != null ? dRMOptions.getType() : null;
        DRMOptions dRMOptions2 = this.drm;
        String licenseServer = dRMOptions2 != null ? dRMOptions2.getLicenseServer() : null;
        DRMOptions dRMOptions3 = this.drm;
        Boolean boolValueOf = dRMOptions3 != null ? Boolean.valueOf(dRMOptions3.getMultiKey()) : null;
        DRMOptions dRMOptions4 = this.drm;
        String strW0 = (dRMOptions4 == null || (headers2 = dRMOptions4.getHeaders()) == null || (setKeySet = headers2.keySet()) == null) ? null : z92.W0(setKeySet, null, null, null, new gb(14), 31);
        DRMOptions dRMOptions5 = this.drm;
        String strW02 = (dRMOptions5 == null || (headers = dRMOptions5.getHeaders()) == null || (collectionValues = headers.values()) == null) ? null : z92.W0(collectionValues, null, null, null, new od2(13), 31);
        VideoMetadata videoMetadata = this.metadata;
        String title = videoMetadata != null ? videoMetadata.getTitle() : null;
        VideoMetadata videoMetadata2 = this.metadata;
        String artist = videoMetadata2 != null ? videoMetadata2.getArtist() : null;
        VideoMetadata videoMetadata3 = this.metadata;
        if (videoMetadata3 != null && (artwork = videoMetadata3.getArtwork()) != null) {
            path = artwork.getPath();
        }
        String value = this.contentType.getValue();
        StringBuilder sb = new StringBuilder("uri:");
        sb.append(uri);
        sb.append("Headers: ");
        sb.append(map);
        sb.append("DrmType:");
        sb.append(type);
        sb.append("DrmLicenseServer:");
        sb.append(licenseServer);
        sb.append("DrmMultiKey:");
        sb.append(boolValueOf);
        sb.append("DRMHeadersKeys:");
        sb.append(strW0);
        sb.append("}DRMHeadersValues:");
        ia.r(sb, strW02, "}NotificationDataTitle:", title, "NotificationDataSecondaryText:");
        ia.r(sb, artist, "NotificationDataArtwork:", path, "ContentType:");
        sb.append(value);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toMediaId$lambda$0(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toMediaId$lambda$1(String str) {
        str.getClass();
        return str;
    }

    public final ContentType getContentType() {
        return this.contentType;
    }

    public final DRMOptions getDrm() {
        return this.drm;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final VideoMetadata getMetadata() {
        return this.metadata;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean getUseCaching() {
        return this.useCaching;
    }

    public final void setDrm(DRMOptions dRMOptions) {
        this.drm = dRMOptions;
    }

    public final void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public final void setMetadata(VideoMetadata videoMetadata) {
        this.metadata = videoMetadata;
    }

    public final void setUri(Uri uri) {
        this.uri = uri;
    }

    public final void setUseCaching(boolean z) {
        this.useCaching = z;
    }

    public final ij9 toMediaItem(Context context) throws UnsupportedDRMTypeException {
        ij9.f fVar;
        context.getClass();
        ij9.b.a aVar = new ij9.b.a();
        ij9.d.a aVar2 = new ij9.d.a();
        List list = Collections.EMPTY_LIST;
        qyc qycVar = qyc.e;
        ij9.e.a aVar3 = new ij9.e.a();
        ij9.g gVar = ij9.g.d;
        Uri localAssetId = parseLocalAssetId(this.uri, context);
        String mimeTypeString = this.contentType.toMimeTypeString();
        if (mimeTypeString == null) {
            mimeTypeString = null;
        }
        DRMOptions dRMOptions = this.drm;
        if (dRMOptions != null) {
            if (!dRMOptions.getType().isSupported()) {
                throw new UnsupportedDRMTypeException(dRMOptions.getType());
            }
            ij9.d dRMConfiguration = dRMOptions.toDRMConfiguration();
            aVar2 = dRMConfiguration != null ? dRMConfiguration.a() : new ij9.d.a();
        }
        UUID uuid = aVar2.a;
        oj9.a aVar4 = new oj9.a();
        VideoMetadata videoMetadata = this.metadata;
        if (videoMetadata != null) {
            aVar4.a = videoMetadata.getTitle();
            aVar4.b = videoMetadata.getArtist();
            Uri artwork = videoMetadata.getArtwork();
            if (artwork != null) {
                aVar4.m = artwork;
            }
        }
        oj9 oj9Var = new oj9(aVar4);
        ka2.q(aVar2.b == null || uuid != null);
        if (localAssetId != null) {
            fVar = new ij9.f(localAssetId, mimeTypeString, uuid != null ? new ij9.d(aVar2) : null, null, list, null, qycVar, -9223372036854775807L);
        } else {
            fVar = null;
        }
        return new ij9("", new ij9.c(aVar), fVar, new ij9.e(aVar3), oj9Var, gVar);
    }

    public final h toMediaSource(Context context) {
        a.InterfaceC0038a interfaceC0038aA;
        context.getClass();
        if (this.uri == null) {
            return null;
        }
        if (getUseCaching()) {
            a.C0039a c0039a = new a.C0039a();
            c0039a.b = new FileDataSource.a();
            yng.a.getClass();
            c0039a.a = yng.b().e;
            c0039a.d = 2;
            c0039a.c = ef3.a(context, this);
            interfaceC0038aA = c0039a;
        } else {
            interfaceC0038aA = ef3.a(context, this);
        }
        d dVar = new d(new c.a(context), new in3());
        dVar.b = interfaceC0038aA;
        d.a aVar = dVar.a;
        if (interfaceC0038aA != aVar.d) {
            aVar.d = interfaceC0038aA;
            aVar.b.clear();
            aVar.c.clear();
        }
        h hVarA = dVar.a(toMediaItem(context));
        hVarA.getClass();
        return hVarA;
    }

    public VideoSource(Uri uri, DRMOptions dRMOptions, VideoMetadata videoMetadata, Map<String, String> map, boolean z, ContentType contentType) {
        contentType.getClass();
        this.uri = uri;
        this.drm = dRMOptions;
        this.metadata = videoMetadata;
        this.headers = map;
        this.useCaching = z;
        this.contentType = contentType;
    }

    public VideoSource() {
        this(null, null, null, null, false, null, 63, null);
    }
}
