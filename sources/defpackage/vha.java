package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class vha implements oec {
    public final e9a a;
    public final uha b;

    public vha(e9a e9aVar, uha uhaVar) {
        this.a = e9aVar;
        this.b = uhaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vha)) {
            return false;
        }
        vha vhaVar = (vha) obj;
        return this.a.equals(vhaVar.a) && this.b.equals(vhaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.oec
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        uha uhaVar = this.b;
        Iterator<T> it = uhaVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((mkd) it.next()).a());
        }
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        Iterator<T> it2 = uhaVar.b.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((mkd) it2.next()).a());
        }
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        for (vy7 vy7Var : uhaVar.c) {
            vy7Var.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("id", vy7Var.a);
            bundle2.putString("status", vy7Var.b);
            bundle2.putLong("sentAt", vy7Var.c);
            arrayList3.add(bundle2);
        }
        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
        for (pj7 pj7Var : uhaVar.d) {
            pj7Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putString("id", pj7Var.a);
            bundle3.putString("category", pj7Var.b);
            bundle3.putLong("interviewStartTime", pj7Var.c.longValue());
            String str = pj7Var.d;
            if (str != null) {
                bundle3.putString("interviewDuration", str);
            }
            arrayList4.add(bundle3);
        }
        bundle.putParcelableArrayList("savedJobs", arrayList);
        bundle.putParcelableArrayList("appliedJobs", arrayList2);
        bundle.putParcelableArrayList("invitations", arrayList3);
        bundle.putParcelableArrayList("interviews", arrayList4);
        bundle.putLong("currentTimestamp", uhaVar.e);
        bundle.putBoolean("pushEnabled", uhaVar.f);
        return aq1.a(new Pair("nativeContext", this.a.toBundle()), new Pair("dashboardData", bundle));
    }

    public final String toString() {
        return "NextStepsDashboardProps(nativeContext=" + this.a + ", dashboardData=" + this.b + ")";
    }
}
