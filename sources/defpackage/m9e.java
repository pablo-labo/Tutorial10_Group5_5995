package defpackage;

import android.util.Log;
import defpackage.z9e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {74}, m = "invokeSuspend")
public final class m9e extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $sessionId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9e(String str, lu2<? super m9e> lu2Var) {
        super(2, lu2Var);
        this.$sessionId = str;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new m9e(this.$sessionId, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((m9e) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            dg5 dg5Var = dg5.a;
            this.label = 1;
            obj = dg5Var.b(this);
            g13 g13Var = g13.a;
            if (obj == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        Collection collectionValues = ((Map) obj).values();
        String str = this.$sessionId;
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((z9e) it.next()).b(new z9e.b(str));
            Log.d("SessionLifecycleClient", "Notified " + z9e.a.a + " of new session " + str);
        }
        return j6g.a;
    }
}
