package com.indeed.android.backendservices.common.api;

import com.indeed.android.backendservices.common.api.a;
import defpackage.av1;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m6d;
import defpackage.pu2;
import defpackage.uh3;
import defpackage.wg0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: com.indeed.android.backendservices.common.api.b$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.backendservices.common.api.BaseApiTask$DefaultImpls", f = "BaseApiTask.kt", l = {46}, m = "makeRetrofitRequest")
        public static final class C0163a<ResponseType> extends pu2 {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return a.a(null, null, null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static <ResponseType> java.lang.Object a(com.indeed.android.backendservices.common.api.b r10, kotlin.jvm.functions.Function1<? super defpackage.lu2<? super defpackage.m6d<ResponseType>>, ? extends java.lang.Object> r11, kotlin.jvm.functions.Function2<? super com.indeed.android.backendservices.common.api.ApiError, ? super okhttp3.Request, defpackage.j6g> r12, defpackage.lu2<? super defpackage.wg0<ResponseType>> r13) {
            /*
                boolean r0 = r13 instanceof com.indeed.android.backendservices.common.api.b.a.C0163a
                if (r0 == 0) goto L13
                r0 = r13
                com.indeed.android.backendservices.common.api.b$a$a r0 = (com.indeed.android.backendservices.common.api.b.a.C0163a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.indeed.android.backendservices.common.api.b$a$a r0 = new com.indeed.android.backendservices.common.api.b$a$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.result
                int r1 = r0.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L3e
                if (r1 != r3) goto L38
                java.lang.Object r10 = r0.L$2
                com.indeed.android.backendservices.common.api.b r10 = (com.indeed.android.backendservices.common.api.b) r10
                java.lang.Object r11 = r0.L$1
                r12 = r11
                kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                java.lang.Object r11 = r0.L$0
                com.indeed.android.backendservices.common.api.b r11 = (com.indeed.android.backendservices.common.api.b) r11
                defpackage.r7d.b(r13)     // Catch: java.lang.Exception -> L33
                goto L53
            L33:
                r0 = move-exception
                r10 = r0
                r7 = r10
                r10 = r11
                goto L5d
            L38:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r10)
                return r2
            L3e:
                defpackage.r7d.b(r13)
                r0.L$0 = r10     // Catch: java.lang.Exception -> L5a
                r0.L$1 = r12     // Catch: java.lang.Exception -> L5a
                r0.L$2 = r10     // Catch: java.lang.Exception -> L5a
                r0.label = r3     // Catch: java.lang.Exception -> L5a
                java.lang.Object r13 = r11.invoke(r0)     // Catch: java.lang.Exception -> L5a
                g13 r11 = defpackage.g13.a
                if (r13 != r11) goto L52
                return r11
            L52:
                r11 = r10
            L53:
                m6d r13 = (defpackage.m6d) r13     // Catch: java.lang.Exception -> L33
                wg0 r10 = b(r10, r13, r12)     // Catch: java.lang.Exception -> L33
                return r10
            L5a:
                r0 = move-exception
                r11 = r0
                r7 = r11
            L5d:
                com.indeed.android.backendservices.common.api.ApiError r3 = new com.indeed.android.backendservices.common.api.ApiError
                com.indeed.android.backendservices.common.api.a$e r4 = new com.indeed.android.backendservices.common.api.a$e
                r4.<init>()
                r8 = 6
                r9 = 0
                r5 = 0
                r6 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r12.invoke(r3, r2)
                wg0$a r10 = r10.a(r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.backendservices.common.api.b.a.a(com.indeed.android.backendservices.common.api.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, lu2):java.lang.Object");
        }

        public static <ResponseType> wg0<ResponseType> b(b bVar, m6d<ResponseType> m6dVar, Function2<? super ApiError, ? super Request, j6g> function2) {
            Response response = m6dVar.a;
            int i = response.d;
            if (!response.h()) {
                ResponseBody responseBody = m6dVar.c;
                String strV = responseBody != null ? responseBody.v() : null;
                function2.invoke(new ApiError(new a.C0162a(), null, new ErrorData(strV == null ? "" : strV, String.valueOf(i)), new HttpStatusCodeError(i), 2, null), response.a);
                return bVar.b(i, strV);
            }
            ResponseType responsetype = m6dVar.b;
            if (responsetype != null) {
                return new wg0.b(responsetype);
            }
            EmptyResponseBodyError emptyResponseBodyError = new EmptyResponseBodyError();
            function2.invoke(new ApiError(a.d.d, "Missing response: " + emptyResponseBodyError, null, emptyResponseBodyError, 4, null), null);
            return bVar.a(emptyResponseBodyError);
        }
    }

    wg0.a a(Exception exc);

    wg0.a b(int i, String str);

    <ResponseType> wg0<ResponseType> j(av1<ResponseType> av1Var, Function2<? super ApiError, ? super Request, j6g> function2);

    <ResponseType> Object r(Function1<? super lu2<? super m6d<ResponseType>>, ? extends Object> function1, Function2<? super ApiError, ? super Request, j6g> function2, lu2<? super wg0<ResponseType>> lu2Var);
}
