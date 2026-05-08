package defpackage;

import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.c;
import com.swmansion.rnscreens.i;
import com.wlappdebug.DebugProctorActivity;
import com.wlproctor.common.PayloadSpecification;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ai3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ai3(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                DebugProctorActivity debugProctorActivity = (DebugProctorActivity) callback;
                int i2 = DebugProctorActivity.t0;
                ArrayList<DebugProctorActivity.e> arrayList = debugProctorActivity.r0;
                for (DebugProctorActivity.e eVar : arrayList) {
                    try {
                        c7b.a(eVar.a.a(), eVar.c);
                    } catch (Exception e) {
                        c.a aVar = new c.a(debugProctorActivity);
                        StringBuilder sb = new StringBuilder("Error decoding override payload for ");
                        sb.append(eVar.a.getName());
                        sb.append(": ");
                        sb.append(e);
                        sb.append("\n\nThe payload must be written for type ");
                        PayloadSpecification payloadSpecificationA = eVar.a.a();
                        sb.append(payloadSpecificationA != null ? payloadSpecificationA.a : null);
                        sb.append(JwtParser.SEPARATOR_CHAR);
                        aVar.a.f = sb.toString();
                        aVar.a("OK", null);
                        aVar.b();
                        return;
                    }
                }
                for (DebugProctorActivity.e eVar2 : arrayList) {
                    yob<k2> yobVarE = debugProctorActivity.E();
                    ybf ybfVar = eVar2.a;
                    yobVarE.f(eVar2.b, ybfVar.getName());
                    debugProctorActivity.E().e(ybfVar.getName(), c7b.a(ybfVar.a(), eVar2.c));
                }
                debugProctorActivity.finish();
                break;
            case 1:
                ((buc) callback).a.w();
                break;
            default:
                i.i((i) callback);
                break;
        }
    }
}
