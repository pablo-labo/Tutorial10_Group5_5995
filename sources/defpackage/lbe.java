package defpackage;

import defpackage.rjb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
public final class lbe extends c1f implements Function2<s3a, lu2<? super j6g>, Object> {
    final /* synthetic */ rjb.a<Object> $key;
    final /* synthetic */ Object $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jbe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbe(Object obj, rjb.a<Object> aVar, jbe jbeVar, lu2<? super lbe> lu2Var) {
        super(2, lu2Var);
        this.$value = obj;
        this.$key = aVar;
        this.this$0 = jbeVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        lbe lbeVar = new lbe(this.$value, this.$key, this.this$0, lu2Var);
        lbeVar.L$0 = obj;
        return lbeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s3a s3aVar, lu2<? super j6g> lu2Var) {
        return ((lbe) create(s3aVar, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        s3a s3aVar = (s3a) this.L$0;
        Object obj2 = this.$value;
        rjb.a<?> aVar = this.$key;
        if (obj2 != null) {
            s3aVar.getClass();
            aVar.getClass();
            s3aVar.c(aVar, obj2);
        } else {
            s3aVar.getClass();
            aVar.getClass();
            if (s3aVar.b.get()) {
                r6.g("Do mutate preferences once returned to DataStore.");
                return null;
            }
            s3aVar.a.remove(aVar);
        }
        jbe.a(this.this$0, s3aVar);
        return j6g.a;
    }
}
