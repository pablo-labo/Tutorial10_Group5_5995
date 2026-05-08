package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class wm2 implements OnSuccessListener {
    public Object a;

    public wm2(int i) {
        switch (i) {
            case 4:
                h97 h97VarB = ((ep7) cr8.p(ep7.class)).b();
                String displayCountry = new Locale(h97VarB.b, h97VarB.a).getDisplayCountry();
                displayCountry.getClass();
                this.a = hh2.e(displayCountry);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public void a(Path path) {
        ArrayList arrayList = (ArrayList) this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            juf jufVar = (juf) arrayList.get(size);
            Matrix matrix = ckg.a;
            if (jufVar != null && !jufVar.a) {
                ckg.a(path, jufVar.d.j() / 100.0f, jufVar.e.j() / 100.0f, jufVar.f.j() / 360.0f);
            }
        }
    }

    public Object b(qf8 qf8Var, Object obj) {
        ((Fragment) obj).getClass();
        qf8Var.getClass();
        Object obj2 = this.a;
        if (obj2 != null) {
            return obj2;
        }
        r6.g("The binding is only available between onCreateView and onDestroyView.");
        return null;
    }

    public t52 c(hvc hvcVar) {
        hc0 hc0Var = (hc0) this.a;
        if (hc0Var != null) {
            return hc0Var.e(hvcVar);
        }
        wl7.g("resolver");
        throw null;
    }

    public void d(qf8 qf8Var, Object obj, Object obj2) {
        Fragment fragment = (Fragment) obj;
        fragment.getClass();
        qf8Var.getClass();
        this.a = obj2;
        fragment.getViewLifecycleOwner().getLifecycle().a(new uq5(this));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z;
        lgh lghVar = (lgh) obj;
        if (!((FirebaseMessaging) this.a).a.h.a() || lghVar.h.a() == null) {
            return;
        }
        synchronized (lghVar) {
            z = lghVar.g;
        }
        if (z) {
            return;
        }
        lghVar.b(0L);
    }

    public /* synthetic */ wm2(Object obj) {
        this.a = obj;
    }
}
