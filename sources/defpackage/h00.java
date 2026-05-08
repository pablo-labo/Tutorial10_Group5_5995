package defpackage;

import android.content.res.Resources;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h00 implements OnSuccessListener, b6d, zgb {
    public Object a;

    public h00(int i) {
        switch (i) {
            case 5:
                this.a = new HashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public void a(n42 n42Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        long[] jArr = n42Var.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(n42Var.e[0]), n42Var);
    }

    public cse b(String str) {
        ise iseVar;
        synchronized (this) {
            iseVar = (ise) ((HashMap) this.a).get(str);
        }
        if (iseVar == null) {
            return null;
        }
        return iseVar.a();
    }

    @Override // defpackage.b6d
    public f5d c(f5d f5dVar, ova ovaVar) {
        Resources resources = (Resources) this.a;
        if (f5dVar == null) {
            return null;
        }
        return new dn8(resources, f5dVar);
    }

    @Override // defpackage.zgb
    public long e(ph7 ph7Var, long j, vl8 vl8Var, long j2) {
        long j3 = ((lh7) ((gu5) this.a).invoke()).a;
        int iF = wab.f(ph7Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), vl8Var == vl8.a);
        return (((long) wab.f(ph7Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iF) << 32);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        ((b00) this.a).invoke(obj);
    }

    public /* synthetic */ h00(Object obj) {
        this.a = obj;
    }
}
