package expo.modules.documentpicker;

import defpackage.ftc;
import defpackage.w85;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\nR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\f¨\u0006 "}, d2 = {"Lexpo/modules/documentpicker/DocumentPickerResult;", "Lftc;", "", "canceled", "", "Lexpo/modules/documentpicker/DocumentInfo;", "assets", "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lexpo/modules/documentpicker/DocumentPickerResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCanceled", "getCanceled$annotations", "()V", "Ljava/util/List;", "getAssets", "getAssets$annotations", "expo-document-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DocumentPickerResult implements ftc {
    private final List<DocumentInfo> assets;
    private final boolean canceled;

    public /* synthetic */ DocumentPickerResult(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentPickerResult copy$default(DocumentPickerResult documentPickerResult, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = documentPickerResult.canceled;
        }
        if ((i & 2) != 0) {
            list = documentPickerResult.assets;
        }
        return documentPickerResult.copy(z, list);
    }

    @w85
    public static /* synthetic */ void getAssets$annotations() {
    }

    @w85
    public static /* synthetic */ void getCanceled$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    public final List<DocumentInfo> component2() {
        return this.assets;
    }

    public final DocumentPickerResult copy(boolean canceled, List<DocumentInfo> assets) {
        return new DocumentPickerResult(canceled, assets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentPickerResult)) {
            return false;
        }
        DocumentPickerResult documentPickerResult = (DocumentPickerResult) other;
        return this.canceled == documentPickerResult.canceled && wl7.b(this.assets, documentPickerResult.assets);
    }

    public final List<DocumentInfo> getAssets() {
        return this.assets;
    }

    public final boolean getCanceled() {
        return this.canceled;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.canceled) * 31;
        List<DocumentInfo> list = this.assets;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "DocumentPickerResult(canceled=" + this.canceled + ", assets=" + this.assets + ")";
    }

    public DocumentPickerResult(boolean z, List<DocumentInfo> list) {
        this.canceled = z;
        this.assets = list;
    }

    public DocumentPickerResult() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
