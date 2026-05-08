package defpackage;

import android.util.Patterns;
import defpackage.zx2;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eu implements gu5 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eu(e13 e13Var, v1f v1fVar, g4a g4aVar) {
        this.c = e13Var;
        this.d = v1fVar;
        this.b = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj;
                g4a g4aVar = (g4a) obj3;
                g4a g4aVar2 = (g4a) obj2;
                String str = (String) g4aVar.getValue();
                if (str == null || zve.U(str) || Patterns.WEB_URL.matcher(String.valueOf((String) g4aVar.getValue())).matches()) {
                    g4aVar2.setValue(Boolean.FALSE);
                    ibaVar.p("DATE_AWARDED");
                } else {
                    g4aVar2.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                u63.Y((e13) obj, null, null, new zx2.a((v1f) obj2, (g4a) obj3, null), 3);
                break;
            default:
                y1e y1eVar = (y1e) obj3;
                File file = (File) obj2;
                y1eVar.getClass();
                file.getClass();
                u63.Y(ee3.p(y1eVar), null, null, new n2e(y1eVar, file, null), 3);
                ((iba) obj).r();
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ eu(iba ibaVar, g4a g4aVar, g4a g4aVar2) {
        this.c = ibaVar;
        this.b = g4aVar;
        this.d = g4aVar2;
    }

    public /* synthetic */ eu(y1e y1eVar, File file, iba ibaVar) {
        this.b = y1eVar;
        this.d = file;
        this.c = ibaVar;
    }
}
