package defpackage;

import android.util.Log;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.messaging.ui.inbox.components.ConversationListKt$ConversationList$6$1", f = "ConversationList.kt", l = {}, m = "invokeSuspend")
public final class sx2 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ f7d $bannerState;
    final /* synthetic */ e13 $coroutineScope;
    final /* synthetic */ ss8 $listState;
    int label;

    @uh3(c = "com.indeed.android.messaging.ui.inbox.components.ConversationListKt$ConversationList$6$1$1", f = "ConversationList.kt", l = {142}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ss8 $listState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ss8 ss8Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$listState = ss8Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$listState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                ss8 ss8Var = this.$listState;
                this.label = 1;
                Object objK = ss8.k(ss8Var, 0, this);
                g13 g13Var = g13.a;
                if (objK == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx2(f7d f7dVar, e13 e13Var, ss8 ss8Var, lu2<? super sx2> lu2Var) {
        super(2, lu2Var);
        this.$bannerState = f7dVar;
        this.$coroutineScope = e13Var;
        this.$listState = ss8Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new sx2(this.$bannerState, this.$coroutineScope, this.$listState, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((sx2) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        ArrayList arrayList = lz2.a;
        Log.d("ResponsiveBanner", "ResponsiveBanner showBanner change: " + this.$bannerState.a(), null);
        u63.Y(this.$coroutineScope, null, null, new a(this.$listState, null), 3);
        return j6g.a;
    }
}
