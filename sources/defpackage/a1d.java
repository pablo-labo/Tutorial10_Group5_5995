package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
public final class a1d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ Function2<String, lu2<? super j6g>, Object> $onFailure;
    final /* synthetic */ Function2<JSONObject, lu2<? super j6g>, Object> $onSuccess;
    int label;
    final /* synthetic */ b1d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a1d(b1d b1dVar, Map<String, String> map, Function2<? super JSONObject, ? super lu2<? super j6g>, ? extends Object> function2, Function2<? super String, ? super lu2<? super j6g>, ? extends Object> function22, lu2<? super a1d> lu2Var) {
        super(2, lu2Var);
        this.this$0 = b1dVar;
        this.$headerOptions = map;
        this.$onSuccess = function2;
        this.$onFailure = function22;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new a1d(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((a1d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r8.invoke(r0, r7) == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r0.invoke(r2, r7) != r4) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a1d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
