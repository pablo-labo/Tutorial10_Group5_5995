package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes3.dex */
public final class mh4 implements l74 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mh4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l74
    public final void dispose() {
        lr5 lr5VarU;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj;
                ibaVar.getClass();
                ibaVar.q.remove((gh4) obj2);
                break;
            case 1:
                iba ibaVar2 = (iba) obj;
                ibaVar2.getClass();
                ibaVar2.q.remove((oi4) obj2);
                break;
            default:
                if (((Boolean) ((g4a) obj2).getValue()).booleanValue()) {
                    Context context = (Context) obj;
                    Fragment fragmentD = null;
                    g gVar = context instanceof g ? (g) context : null;
                    if (gVar != null && (lr5VarU = gVar.u()) != null) {
                        fragmentD = lr5VarU.D("RNProfileModalOverlay");
                    }
                    if (fragmentD != null) {
                        lr5 lr5VarU2 = gVar.u();
                        lr5VarU2.getClass();
                        a aVar = new a(lr5VarU2);
                        aVar.l(fragmentD);
                        aVar.h(true);
                    }
                }
                break;
        }
    }
}
