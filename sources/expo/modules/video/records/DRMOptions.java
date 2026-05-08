package expo.modules.video.records;

import android.net.Uri;
import defpackage.f47;
import defpackage.ftc;
import defpackage.ij9;
import defpackage.w85;
import expo.modules.video.enums.DRMType;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0017\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR6\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u001d\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010#\u0012\u0004\b(\u0010\u0016\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lexpo/modules/video/records/DRMOptions;", "Lftc;", "Ljava/io/Serializable;", "Lexpo/modules/video/enums/DRMType;", "type", "", "licenseServer", "", "headers", "", "multiKey", "<init>", "(Lexpo/modules/video/enums/DRMType;Ljava/lang/String;Ljava/util/Map;Z)V", "Lij9$d;", "toDRMConfiguration", "()Lij9$d;", "Lexpo/modules/video/enums/DRMType;", "getType", "()Lexpo/modules/video/enums/DRMType;", "setType", "(Lexpo/modules/video/enums/DRMType;)V", "getType$annotations", "()V", "Ljava/lang/String;", "getLicenseServer", "()Ljava/lang/String;", "setLicenseServer", "(Ljava/lang/String;)V", "getLicenseServer$annotations", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getHeaders$annotations", "Z", "getMultiKey", "()Z", "setMultiKey", "(Z)V", "getMultiKey$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DRMOptions implements ftc, Serializable {
    private Map<String, String> headers;
    private String licenseServer;
    private boolean multiKey;
    private DRMType type;

    public /* synthetic */ DRMOptions(DRMType dRMType, String str, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DRMType.WIDEVINE : dRMType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : map, (i & 8) != 0 ? false : z);
    }

    @w85
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @w85
    public static /* synthetic */ void getLicenseServer$annotations() {
    }

    @w85
    public static /* synthetic */ void getMultiKey$annotations() {
    }

    @w85
    public static /* synthetic */ void getType$annotations() {
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getLicenseServer() {
        return this.licenseServer;
    }

    public final boolean getMultiKey() {
        return this.multiKey;
    }

    public final DRMType getType() {
        return this.type;
    }

    public final void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public final void setLicenseServer(String str) {
        this.licenseServer = str;
    }

    public final void setMultiKey(boolean z) {
        this.multiKey = z;
    }

    public final void setType(DRMType dRMType) {
        dRMType.getClass();
        this.type = dRMType;
    }

    public final ij9.d toDRMConfiguration() {
        ij9.d.a aVar = new ij9.d.a(this.type.toUUID());
        String str = this.licenseServer;
        if (str != null) {
            aVar.b = Uri.parse(str);
        }
        Map<String, String> map = this.headers;
        if (map != null) {
            aVar.c = f47.a(map);
        }
        aVar.d = this.multiKey;
        return new ij9.d(aVar);
    }

    public DRMOptions(DRMType dRMType, String str, Map<String, String> map, boolean z) {
        dRMType.getClass();
        this.type = dRMType;
        this.licenseServer = str;
        this.headers = map;
        this.multiKey = z;
    }

    public DRMOptions() {
        this(null, null, null, false, 15, null);
    }
}
