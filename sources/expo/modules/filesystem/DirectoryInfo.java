package expo.modules.filesystem;

import defpackage.ftc;
import defpackage.w85;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017Jh\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010$\u0012\u0004\b(\u0010)\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010'R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010*\u0012\u0004\b.\u0010)\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010-R0\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010/\u0012\u0004\b3\u0010)\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u00102R*\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010*\u0012\u0004\b6\u0010)\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010-R*\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00107\u0012\u0004\b;\u0010)\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010:R*\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u00107\u0012\u0004\b>\u0010)\u001a\u0004\b<\u0010\u0017\"\u0004\b=\u0010:R*\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u00107\u0012\u0004\bA\u0010)\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010:¨\u0006B"}, d2 = {"Lexpo/modules/filesystem/DirectoryInfo;", "Lftc;", "", "exists", "", "uri", "", "files", "md5", "", "size", "modificationTime", "creationTime", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/Long;", "component6", "component7", "copy", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lexpo/modules/filesystem/DirectoryInfo;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getExists", "setExists", "(Z)V", "getExists$annotations", "()V", "Ljava/lang/String;", "getUri", "setUri", "(Ljava/lang/String;)V", "getUri$annotations", "Ljava/util/List;", "getFiles", "setFiles", "(Ljava/util/List;)V", "getFiles$annotations", "getMd5", "setMd5", "getMd5$annotations", "Ljava/lang/Long;", "getSize", "setSize", "(Ljava/lang/Long;)V", "getSize$annotations", "getModificationTime", "setModificationTime", "getModificationTime$annotations", "getCreationTime", "setCreationTime", "getCreationTime$annotations", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DirectoryInfo implements ftc {
    private Long creationTime;
    private boolean exists;
    private List<String> files;
    private String md5;
    private Long modificationTime;
    private Long size;
    private String uri;

    public /* synthetic */ DirectoryInfo(boolean z, String str, List list, String str2, Long l, Long l2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : l3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DirectoryInfo copy$default(DirectoryInfo directoryInfo, boolean z, String str, List list, String str2, Long l, Long l2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = directoryInfo.exists;
        }
        if ((i & 2) != 0) {
            str = directoryInfo.uri;
        }
        if ((i & 4) != 0) {
            list = directoryInfo.files;
        }
        if ((i & 8) != 0) {
            str2 = directoryInfo.md5;
        }
        if ((i & 16) != 0) {
            l = directoryInfo.size;
        }
        if ((i & 32) != 0) {
            l2 = directoryInfo.modificationTime;
        }
        if ((i & 64) != 0) {
            l3 = directoryInfo.creationTime;
        }
        Long l4 = l2;
        Long l5 = l3;
        Long l6 = l;
        List list2 = list;
        return directoryInfo.copy(z, str, list2, str2, l6, l4, l5);
    }

    @w85
    public static /* synthetic */ void getCreationTime$annotations() {
    }

    @w85
    public static /* synthetic */ void getExists$annotations() {
    }

    @w85
    public static /* synthetic */ void getFiles$annotations() {
    }

    @w85
    public static /* synthetic */ void getMd5$annotations() {
    }

    @w85
    public static /* synthetic */ void getModificationTime$annotations() {
    }

    @w85
    public static /* synthetic */ void getSize$annotations() {
    }

    @w85
    public static /* synthetic */ void getUri$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final List<String> component3() {
        return this.files;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getModificationTime() {
        return this.modificationTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getCreationTime() {
        return this.creationTime;
    }

    public final DirectoryInfo copy(boolean exists, String uri, List<String> files, String md5, Long size, Long modificationTime, Long creationTime) {
        return new DirectoryInfo(exists, uri, files, md5, size, modificationTime, creationTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectoryInfo)) {
            return false;
        }
        DirectoryInfo directoryInfo = (DirectoryInfo) other;
        return this.exists == directoryInfo.exists && wl7.b(this.uri, directoryInfo.uri) && wl7.b(this.files, directoryInfo.files) && wl7.b(this.md5, directoryInfo.md5) && wl7.b(this.size, directoryInfo.size) && wl7.b(this.modificationTime, directoryInfo.modificationTime) && wl7.b(this.creationTime, directoryInfo.creationTime);
    }

    public final Long getCreationTime() {
        return this.creationTime;
    }

    public final boolean getExists() {
        return this.exists;
    }

    public final List<String> getFiles() {
        return this.files;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final Long getModificationTime() {
        return this.modificationTime;
    }

    public final Long getSize() {
        return this.size;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.exists) * 31;
        String str = this.uri;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.files;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.md5;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.size;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.modificationTime;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.creationTime;
        return iHashCode6 + (l3 != null ? l3.hashCode() : 0);
    }

    public final void setCreationTime(Long l) {
        this.creationTime = l;
    }

    public final void setExists(boolean z) {
        this.exists = z;
    }

    public final void setFiles(List<String> list) {
        this.files = list;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    public final void setModificationTime(Long l) {
        this.modificationTime = l;
    }

    public final void setSize(Long l) {
        this.size = l;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public String toString() {
        return "DirectoryInfo(exists=" + this.exists + ", uri=" + this.uri + ", files=" + this.files + ", md5=" + this.md5 + ", size=" + this.size + ", modificationTime=" + this.modificationTime + ", creationTime=" + this.creationTime + ")";
    }

    public DirectoryInfo(boolean z, String str, List<String> list, String str2, Long l, Long l2, Long l3) {
        this.exists = z;
        this.uri = str;
        this.files = list;
        this.md5 = str2;
        this.size = l;
        this.modificationTime = l2;
        this.creationTime = l3;
    }
}
