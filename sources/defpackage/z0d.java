package defpackage;

import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class z0d {
    public final v03 a;
    public final vf5 b;
    public final b1d c;
    public final jbe d;
    public final a5a e = pnb.i();

    @uh3(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    public static final class a extends pu2 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public a(pu2 pu2Var) {
            super(pu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return z0d.this.b(this);
        }
    }

    @uh3(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 131, 133, 134, 136}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<JSONObject, lu2<? super j6g>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            b bVar = z0d.this.new b(lu2Var);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JSONObject jSONObject, lu2<? super j6g> lu2Var) {
            return ((b) create(jSONObject, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
        
            if (r14 == r7) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01a8, code lost:
        
            if (r13 == r7) goto L84;
         */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
        /* JADX WARN: Type inference failed for: r14v14, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z0d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<String, lu2<? super j6g>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            c cVar = new c(2, lu2Var);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, lu2<? super j6g> lu2Var) {
            return ((c) create(str, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.L$0));
            return j6g.a;
        }
    }

    public z0d(v03 v03Var, vf5 vf5Var, sn0 sn0Var, b1d b1dVar, if3 if3Var) {
        this.a = v03Var;
        this.b = vf5Var;
        this.c = b1dVar;
        this.d = new jbe(if3Var);
    }

    public final Boolean a() {
        x8e x8eVar = this.d.b;
        if (x8eVar != null) {
            return x8eVar.a;
        }
        wl7.g("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:46:0x00ba, B:48:0x00c4, B:51:0x00cf, B:54:0x015f), top: B:65:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf A[Catch: all -> 0x0056, TRY_ENTER, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:46:0x00ba, B:48:0x00c4, B:51:0x00cf, B:54:0x015f), top: B:65:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.lu2<? super defpackage.j6g> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z0d.b(lu2):java.lang.Object");
    }
}
