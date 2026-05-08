package expo.modules.fetch;

import android.util.Log;
import defpackage.aaa;
import defpackage.c1f;
import defpackage.dc;
import defpackage.e13;
import defpackage.gk0;
import defpackage.h4;
import defpackage.hl2;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.me;
import defpackage.q6d;
import defpackage.r6;
import defpackage.r7d;
import defpackage.to1;
import defpackage.u63;
import defpackage.uh3;
import defpackage.ut0;
import defpackage.w92;
import defpackage.wl7;
import defpackage.z9a;
import defpackage.zn1;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lexpo/modules/fetch/NativeResponse;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lokhttp3/Callback;", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeResponse extends SharedObject implements Callback {
    public aaa V;
    public Exception W;
    public NativeRequestRedirect X;
    public final e13 c;
    public final hl2 d;
    public q6d e;
    public final ArrayList f;

    @uh3(c = "expo.modules.fetch.NativeResponse$onResponse$1", f = "NativeResponse.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ Response $response;
        int label;
        final /* synthetic */ NativeResponse this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Response response, NativeResponse nativeResponse, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$response = response;
            this.this$0 = nativeResponse;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$response, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            to1 e;
            q6d q6dVar = q6d.BODY_STREAMING_STARTED;
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            ResponseBody responseBody = this.$response.V;
            if (responseBody == null || (e = responseBody.getE()) == null) {
                return j6g.a;
            }
            NativeResponse nativeResponse = this.this$0;
            nativeResponse.getClass();
            while (!e.W0()) {
                try {
                    q6d q6dVar2 = q6d.RESPONSE_RECEIVED;
                    if (!nativeResponse.W(q6dVar2, q6dVar, q6d.BODY_STREAMING_CANCELED)) {
                        if (nativeResponse.Q() != q6dVar2) {
                            if (nativeResponse.Q() != q6dVar) {
                                break;
                            }
                            zn1 zn1VarF = e.f();
                            nativeResponse.v("didReceiveResponseData", zn1VarF.l0(zn1VarF.b));
                        } else {
                            hl2 hl2Var = nativeResponse.d;
                            zn1 zn1VarF2 = e.f();
                            byte[] bArrL0 = zn1VarF2.l0(zn1VarF2.b);
                            hl2Var.getClass();
                            hl2Var.a = true;
                            ((ArrayList) hl2Var.b).add(bArrL0);
                        }
                    } else {
                        break;
                    }
                } catch (IOException e2) {
                    nativeResponse.W = e2;
                    if (nativeResponse.Q() == q6dVar) {
                        nativeResponse.v("didFailWithError", h4.t(e2));
                    }
                    nativeResponse.b0(q6d.ERROR_RECEIVED);
                }
            }
            this.$response.close();
            if (this.this$0.Q() == q6dVar) {
                this.this$0.v("didComplete", new Object[0]);
            }
            this.this$0.b0(q6d.BODY_COMPLETED);
            this.this$0.v("readyForJSFinalization", new Object[0]);
            return j6g.a;
        }
    }

    @uh3(c = "expo.modules.fetch.NativeResponse$state$3", f = "NativeResponse.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ q6d $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q6d q6dVar, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$value = q6dVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return NativeResponse.this.new b(this.$value, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            w92.B0(NativeResponse.this.f, new me(this.$value, 13));
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeResponse(gk0 gk0Var, e13 e13Var) {
        super(gk0Var.b);
        e13Var.getClass();
        this.c = e13Var;
        this.d = new hl2();
        this.e = q6d.INITIALIZED;
        this.f = new ArrayList();
    }

    public final q6d Q() {
        q6d q6dVar;
        synchronized (this) {
            q6dVar = this.e;
        }
        return q6dVar;
    }

    public final boolean W(q6d... q6dVarArr) {
        if (ut0.f0(Q(), q6dVarArr)) {
            return false;
        }
        String strT0 = ut0.t0(q6dVarArr, ",", null, null, new dc(15), 30);
        Log.w("NativeResponse", "Invalid state - currentState[" + Q().a() + "] validStates[" + strT0 + "]");
        return true;
    }

    public final void b0(q6d q6dVar) {
        synchronized (this) {
            this.e = q6dVar;
            j6g j6gVar = j6g.a;
        }
        u63.Y(this.c, null, null, new b(q6dVar, null), 3);
    }

    public final byte[] d0() {
        q6d q6dVar = q6d.RESPONSE_RECEIVED;
        q6d q6dVar2 = q6d.BODY_COMPLETED;
        if (W(q6dVar, q6dVar2)) {
            return null;
        }
        q6d q6dVarQ = Q();
        hl2 hl2Var = this.d;
        if (q6dVarQ == q6dVar) {
            b0(q6d.BODY_STREAMING_STARTED);
            v("didReceiveResponseData", hl2Var.a());
        } else if (Q() == q6dVar2) {
            return hl2Var.a();
        }
        return null;
    }

    public final void f0(List<? extends q6d> list, Function1<? super q6d, j6g> function1) {
        if (list.contains(Q())) {
            function1.invoke(Q());
        } else {
            this.f.add(new z9a(0, list, function1));
        }
    }

    @Override // okhttp3.Callback
    public final void h(Call call, IOException iOException) {
        if (wl7.b(iOException.getMessage(), "Canceled")) {
            return;
        }
        q6d q6dVar = q6d.BODY_STREAMING_CANCELED;
        q6d q6dVar2 = q6d.STARTED;
        q6d q6dVar3 = q6d.RESPONSE_RECEIVED;
        q6d q6dVar4 = q6d.BODY_STREAMING_STARTED;
        if (W(q6dVar2, q6dVar3, q6dVar4, q6dVar)) {
            return;
        }
        if (Q() == q6dVar4) {
            v("didFailWithError", h4.t(iOException));
        }
        this.W = iOException;
        b0(q6d.ERROR_RECEIVED);
        v("readyForJSFinalization", new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    @Override // okhttp3.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(okhttp3.Call r10, okhttp3.Response r11) {
        /*
            r9 = this;
            int r2 = r11.d
            r10 = 0
            r0 = 308(0x134, float:4.32E-43)
            r1 = 307(0x133, float:4.3E-43)
            if (r2 == r1) goto Lf
            if (r2 == r0) goto Lf
            switch(r2) {
                case 300: goto Lf;
                case 301: goto Lf;
                case 302: goto Lf;
                case 303: goto Lf;
                default: goto Le;
            }
        Le:
            goto L41
        Lf:
            expo.modules.fetch.NativeRequestRedirect r3 = r9.X
            expo.modules.fetch.NativeRequestRedirect r4 = expo.modules.fetch.NativeRequestRedirect.ERROR
            if (r3 != r4) goto L41
            r11.close()
            expo.modules.fetch.FetchRedirectException r11 = new expo.modules.fetch.FetchRedirectException
            r11.<init>()
            r9.W = r11
            q6d r0 = r9.Q()
            q6d r1 = defpackage.q6d.BODY_STREAMING_STARTED
            if (r0 != r1) goto L34
            java.lang.String r11 = defpackage.h4.t(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r0 = "didFailWithError"
            r9.v(r0, r11)
        L34:
            q6d r11 = defpackage.q6d.ERROR_RECEIVED
            r9.b0(r11)
            java.lang.String r11 = "readyForJSFinalization"
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r9.v(r11, r10)
            return
        L41:
            java.lang.String r3 = r11.c
            okhttp3.Headers r4 = r11.f
            r5 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.t92.r0(r4, r6)
            r1.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L55:
            r6 = r4
            ct0 r6 = (defpackage.ct0) r6
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L75
            java.lang.Object r6 = r6.next()
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r7 = r6.d()
            java.lang.Object r6 = r6.e()
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r7, r6)
            r1.add(r8)
            goto L55
        L75:
            int r4 = r11.d
            if (r4 == r5) goto L80
            if (r4 == r0) goto L80
            switch(r4) {
                case 300: goto L80;
                case 301: goto L80;
                case 302: goto L80;
                case 303: goto L80;
                default: goto L7e;
            }
        L7e:
            r5 = r10
            goto L82
        L80:
            r10 = 1
            goto L7e
        L82:
            okhttp3.Request r10 = r11.a
            okhttp3.HttpUrl r10 = r10.a
            java.lang.String r4 = r10.i
            aaa r0 = new aaa
            r0.<init>(r1, r2, r3, r4, r5)
            r9.V = r0
            q6d r10 = defpackage.q6d.RESPONSE_RECEIVED
            r9.b0(r10)
            no3 r10 = defpackage.no3.c
            expo.modules.fetch.NativeResponse$a r0 = new expo.modules.fetch.NativeResponse$a
            r1 = 0
            r0.<init>(r11, r9, r1)
            r11 = 2
            e13 r9 = r9.c
            defpackage.u63.Y(r9, r10, r1, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.fetch.NativeResponse.p(okhttp3.Call, okhttp3.Response):void");
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public final void s() {
        this.d.a();
    }
}
