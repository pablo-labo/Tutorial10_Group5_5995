package expo.modules.documentpicker;

import defpackage.ftc;
import defpackage.ia;
import defpackage.w85;
import defpackage.wl7;
import defpackage.z3;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u000bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\rR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lexpo/modules/documentpicker/DocumentPickerOptions;", "Lftc;", "", "copyToCacheDirectory", "", "", "type", "multiple", "<init>", "(ZLjava/util/List;Z)V", "component1", "()Z", "component2", "()Ljava/util/List;", "component3", "copy", "(ZLjava/util/List;Z)Lexpo/modules/documentpicker/DocumentPickerOptions;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCopyToCacheDirectory", "getCopyToCacheDirectory$annotations", "()V", "Ljava/util/List;", "getType", "getType$annotations", "getMultiple", "getMultiple$annotations", "expo-document-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DocumentPickerOptions implements ftc {
    private final boolean copyToCacheDirectory;
    private final boolean multiple;
    private final List<String> type;

    public DocumentPickerOptions(boolean z, List<String> list, boolean z2) {
        list.getClass();
        this.copyToCacheDirectory = z;
        this.type = list;
        this.multiple = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocumentPickerOptions copy$default(DocumentPickerOptions documentPickerOptions, boolean z, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = documentPickerOptions.copyToCacheDirectory;
        }
        if ((i & 2) != 0) {
            list = documentPickerOptions.type;
        }
        if ((i & 4) != 0) {
            z2 = documentPickerOptions.multiple;
        }
        return documentPickerOptions.copy(z, list, z2);
    }

    @w85
    public static /* synthetic */ void getCopyToCacheDirectory$annotations() {
    }

    @w85
    public static /* synthetic */ void getMultiple$annotations() {
    }

    @w85
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCopyToCacheDirectory() {
        return this.copyToCacheDirectory;
    }

    public final List<String> component2() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMultiple() {
        return this.multiple;
    }

    public final DocumentPickerOptions copy(boolean copyToCacheDirectory, List<String> type, boolean multiple) {
        type.getClass();
        return new DocumentPickerOptions(copyToCacheDirectory, type, multiple);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentPickerOptions)) {
            return false;
        }
        DocumentPickerOptions documentPickerOptions = (DocumentPickerOptions) other;
        return this.copyToCacheDirectory == documentPickerOptions.copyToCacheDirectory && wl7.b(this.type, documentPickerOptions.type) && this.multiple == documentPickerOptions.multiple;
    }

    public final boolean getCopyToCacheDirectory() {
        return this.copyToCacheDirectory;
    }

    public final boolean getMultiple() {
        return this.multiple;
    }

    public final List<String> getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.multiple) + ia.g(this.type, Boolean.hashCode(this.copyToCacheDirectory) * 31, 31);
    }

    public String toString() {
        boolean z = this.copyToCacheDirectory;
        List<String> list = this.type;
        boolean z2 = this.multiple;
        StringBuilder sb = new StringBuilder("DocumentPickerOptions(copyToCacheDirectory=");
        sb.append(z);
        sb.append(", type=");
        sb.append(list);
        sb.append(", multiple=");
        return z3.o(sb, z2, ")");
    }
}
