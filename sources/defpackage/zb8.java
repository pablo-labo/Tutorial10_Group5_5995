package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
public final class zb8 extends n7d implements wu5<nk3<j6g, JsonElement>, j6g, lu2<? super JsonElement>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ bc8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb8(bc8 bc8Var, lu2<? super zb8> lu2Var) {
        super(3, lu2Var);
        this.this$0 = bc8Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            nk3 nk3Var = (nk3) this.L$0;
            byte bQ = this.this$0.a.q();
            if (bQ == 1) {
                return this.this$0.d(true);
            }
            if (bQ == 0) {
                return this.this$0.d(false);
            }
            bc8 bc8Var = this.this$0;
            if (bQ != 6) {
                if (bQ == 8) {
                    return bc8Var.c();
                }
                eve.m(bc8Var.a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.label = 1;
            obj = bc8.a(bc8Var, nk3Var, this);
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
        return (JsonElement) obj;
    }

    @Override // defpackage.wu5
    public final Object q(nk3<j6g, JsonElement> nk3Var, j6g j6gVar, lu2<? super JsonElement> lu2Var) {
        zb8 zb8Var = new zb8(this.this$0, lu2Var);
        zb8Var.L$0 = nk3Var;
        return zb8Var.invokeSuspend(j6g.a);
    }
}
