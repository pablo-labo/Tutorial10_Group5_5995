package defpackage;

import android.widget.TextView;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rm3 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rm3(i34 i34Var, String str, nqe[] nqeVarArr, ix4 ix4Var) {
        this.c = i34Var;
        this.b = str;
        this.d = nqeVarArr;
        this.e = ix4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0f b0fVar;
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        String str = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Integer num = (Integer) obj2;
                tm3 tm3Var = (tm3) obj;
                String str2 = (((Integer) obj3) == null || num == null || num.intValue() <= 0) ? "" : String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((r5.intValue() / num.intValue()) * 100.0f)}, 1));
                TextView textView = tm3Var.b;
                if (textView != null) {
                    if (str == null) {
                        str = "Loading";
                    }
                    textView.setText(str + str2 + "…");
                }
                break;
            default:
                i34 i34Var = (i34) obj3;
                i34Var.i = str;
                i34Var.j = (nqe[]) obj2;
                i34Var.k = (ix4) obj;
                if (i34Var.q == null) {
                    euc eucVar = new euc(i34Var);
                    eucVar.e(NativeRedBoxSpec.NAME);
                    i34Var.q = eucVar;
                }
                b0f b0fVar2 = i34Var.q;
                if ((b0fVar2 == null || !b0fVar2.a()) && (b0fVar = i34Var.q) != null) {
                    b0fVar.b();
                }
                break;
        }
    }

    public /* synthetic */ rm3(Integer num, Integer num2, tm3 tm3Var, String str) {
        this.c = num;
        this.d = num2;
        this.e = tm3Var;
        this.b = str;
    }
}
