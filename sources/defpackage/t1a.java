package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class t1a implements vhb {
    public final LinkedList a;

    public t1a(ArrayList arrayList) {
        this.a = new LinkedList(arrayList);
    }

    @Override // defpackage.vhb
    public final n82<Bitmap> a(Bitmap bitmap, bbb bbbVar) {
        LinkedList linkedList = this.a;
        bitmap.getClass();
        bbbVar.getClass();
        n82<Bitmap> n82VarA = null;
        try {
            Iterator it = linkedList.iterator();
            n82<Bitmap> n82VarClone = null;
            while (it.hasNext()) {
                n82VarA = ((vhb) it.next()).a(n82VarClone != null ? n82VarClone.P() : bitmap, bbbVar);
                n82.G(n82VarClone);
                n82VarClone = n82VarA.clone();
            }
            if (n82VarA != null) {
                n82<Bitmap> n82VarClone2 = n82VarA.clone();
                n82VarA.close();
                return n82VarClone2;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + linkedList.size()).toString());
        } catch (Throwable th) {
            n82.G(null);
            throw th;
        }
    }

    @Override // defpackage.vhb
    public final ot1 c() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(t92.r0(linkedList, 10));
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((vhb) it.next()).c());
        }
        return new f1a(arrayList);
    }

    @Override // defpackage.vhb
    public final String getName() {
        return l5.m("MultiPostProcessor (", z92.W0(this.a, ",", null, null, null, 62), ")");
    }
}
