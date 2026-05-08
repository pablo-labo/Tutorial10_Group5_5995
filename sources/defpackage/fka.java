package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fka implements xo6 {
    public final List<SavedJobsDto> a;
    public final boolean b;
    public final int c;

    public fka(int i, List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = i;
    }

    public static fka a(fka fkaVar, ArrayList arrayList, boolean z) {
        int i = fkaVar.c;
        fkaVar.getClass();
        return new fka(i, arrayList, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fka)) {
            return false;
        }
        fka fkaVar = (fka) obj;
        return wl7.b(this.a, fkaVar.a) && this.b == fkaVar.b && this.c == fkaVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ia.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonIaBottomSheetState(jobList=");
        sb.append(this.a);
        sb.append(", showBottomSheet=");
        sb.append(this.b);
        sb.append(", size=");
        return w20.k(sb, this.c, ")");
    }

    public fka() {
        this(0);
    }

    public /* synthetic */ fka(int i) {
        this(0, zr4.a, false);
    }
}
