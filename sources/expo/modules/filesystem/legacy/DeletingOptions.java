package expo.modules.filesystem.legacy;

import defpackage.ftc;
import defpackage.w85;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lexpo/modules/filesystem/legacy/DeletingOptions;", "Lftc;", "", "idempotent", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lexpo/modules/filesystem/legacy/DeletingOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getIdempotent", "getIdempotent$annotations", "()V", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DeletingOptions implements ftc {
    private final boolean idempotent;

    public /* synthetic */ DeletingOptions(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ DeletingOptions copy$default(DeletingOptions deletingOptions, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deletingOptions.idempotent;
        }
        return deletingOptions.copy(z);
    }

    @w85
    public static /* synthetic */ void getIdempotent$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public final DeletingOptions copy(boolean idempotent) {
        return new DeletingOptions(idempotent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeletingOptions) && this.idempotent == ((DeletingOptions) other).idempotent;
    }

    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public int hashCode() {
        return Boolean.hashCode(this.idempotent);
    }

    public String toString() {
        return "DeletingOptions(idempotent=" + this.idempotent + ")";
    }

    public DeletingOptions(boolean z) {
        this.idempotent = z;
    }

    public DeletingOptions() {
        this(false, 1, null);
    }
}
