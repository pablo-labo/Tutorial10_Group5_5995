package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class czg extends gq2 {
    public ArrayList<gq2> q0 = new ArrayList<>();

    public void I() {
        ArrayList<gq2> arrayList = this.q0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            gq2 gq2Var = this.q0.get(i);
            if (gq2Var instanceof czg) {
                ((czg) gq2Var).I();
            }
        }
    }

    @Override // defpackage.gq2
    public void x() {
        this.q0.clear();
        super.x();
    }

    @Override // defpackage.gq2
    public final void z(us1 us1Var) {
        super.z(us1Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            this.q0.get(i).z(us1Var);
        }
    }
}
