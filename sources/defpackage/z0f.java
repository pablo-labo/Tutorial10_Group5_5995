package defpackage;

import defpackage.z0f;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.PromiseImpl;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z0f extends s81 {
    public final wu5<e13, Object[], lu2<Object>, Object> h;

    @uh3(c = "expo.modules.kotlin.functions.SuspendFunctionComponent$attachToJSObject$2$1", f = "SuspendFunctionComponent.kt", l = {47}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gk0 $appContext;
        final /* synthetic */ Object[] $args;
        final /* synthetic */ String $moduleName;
        final /* synthetic */ PromiseImpl $promiseImpl;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ z0f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PromiseImpl promiseImpl, z0f z0fVar, String str, Object[] objArr, gk0 gk0Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$promiseImpl = promiseImpl;
            this.this$0 = z0fVar;
            this.$moduleName = str;
            this.$args = objArr;
            this.$appContext = gk0Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.$promiseImpl, this.this$0, this.$moduleName, this.$args, this.$appContext, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0062, B:28:0x0067, B:30:0x006b, B:35:0x0090, B:36:0x0097, B:33:0x0087, B:34:0x008d, B:13:0x002c), top: B:51:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:26:0x0062, B:28:0x0067, B:30:0x006b, B:35:0x0090, B:36:0x0097, B:33:0x0087, B:34:0x008d, B:13:0x002c), top: B:51:0x0003 }] */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: z0f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0f(String str, rf0[] rf0VarArr, wu5<? super e13, ? super Object[], ? super lu2<Object>, ? extends Object> wu5Var) {
        super(str, rf0VarArr);
        str.getClass();
        this.h = wu5Var;
    }

    @Override // defpackage.qf0
    public final void a(final gk0 gk0Var, JSDecoratorsBridgingObject jSDecoratorsBridgingObject, final String str) {
        str.getClass();
        final WeakReference weakReference = new WeakReference(gk0Var);
        boolean zD = d();
        boolean z = this.e;
        rf0[] rf0VarArr = this.b;
        ArrayList arrayList = new ArrayList(rf0VarArr.length);
        for (rf0 rf0Var : rf0VarArr) {
            arrayList.add(((owf) rf0Var.c.getValue()).c());
        }
        jSDecoratorsBridgingObject.registerAsyncFunction(this.a, zD, z, (ExpectedType[]) arrayList.toArray(new ExpectedType[0]), new JNIAsyncFunctionBody(weakReference, str, this, gk0Var) { // from class: y0f
            public final /* synthetic */ String a;
            public final /* synthetic */ z0f b;
            public final /* synthetic */ gk0 c;

            {
                this.a = str;
                this.b = this;
                this.c = gk0Var;
            }

            @Override // expo.modules.kotlin.jni.JNIAsyncFunctionBody
            public final void invoke(Object[] objArr, PromiseImpl promiseImpl) {
                eu2 eu2Var;
                objArr.getClass();
                promiseImpl.getClass();
                z0f z0fVar = this.b;
                cac cacVar = z0fVar.g;
                cac cacVar2 = cac.a;
                gk0 gk0Var2 = this.c;
                if (cacVar == cacVar2) {
                    eu2Var = gk0Var2.g;
                } else {
                    if (cacVar != cac.b) {
                        l.g();
                        return;
                    }
                    eu2Var = gk0Var2.f;
                }
                u63.Y(eu2Var, null, null, new z0f.a(promiseImpl, z0fVar, this.a, objArr, gk0Var2, null), 3);
            }
        });
    }
}
