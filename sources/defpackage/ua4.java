package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ua4 {
    public static final a a = new a(3, null);
    public static final b b = new b(3, null);

    @uh3(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements wu5<e13, ooa, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, ooa ooaVar, lu2<? super j6g> lu2Var) {
            long j = ooaVar.a;
            return new a(3, lu2Var).invokeSuspend(j6g.a);
        }
    }

    @uh3(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements wu5<e13, Float, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r7d.b(obj);
                return j6g.a;
            }
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Float f, lu2<? super j6g> lu2Var) {
            f.floatValue();
            return new b(3, lu2Var).invokeSuspend(j6g.a);
        }
    }

    public static e a(e eVar, xa4 xa4Var, dwa dwaVar, boolean z, boolean z2, wu5 wu5Var, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return eVar.o(new DraggableElement(xa4Var, dwaVar, z, null, (i & 16) != 0 ? false : z2, a, wu5Var, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? false : z3));
    }

    public static final xa4 b(Function1<? super Float, j6g> function1, androidx.compose.runtime.b bVar, int i) {
        g4a g4aVarG = r.g(function1, bVar);
        Object objV = bVar.v();
        if (objV == b.a.a) {
            xm3 xm3Var = new xm3(new vy(2, g4aVarG));
            bVar.p(xm3Var);
            objV = xm3Var;
        }
        return (xa4) objV;
    }
}
