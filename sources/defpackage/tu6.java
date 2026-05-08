package defpackage;

import defpackage.o97;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.ifl.components.IdlFilterChipCarouselKt$IdlFilterChipCarousel$2$1", f = "IdlFilterChipCarousel.kt", l = {303}, m = "invokeSuspend")
public final class tu6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ List<ou6> $filters;
    final /* synthetic */ c3a $lastSelectedFilterId;
    final /* synthetic */ ss8 $listState;
    final /* synthetic */ o97 $theme;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu6(List<ou6> list, ss8 ss8Var, c3a c3aVar, o97 o97Var, lu2<? super tu6> lu2Var) {
        super(2, lu2Var);
        this.$filters = list;
        this.$listState = ss8Var;
        this.$lastSelectedFilterId = c3aVar;
        this.$theme = o97Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new tu6(this.$filters, this.$listState, this.$lastSelectedFilterId, this.$theme, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((tu6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            List<ou6> list = this.$filters;
            c3a c3aVar = this.$lastSelectedFilterId;
            Iterator<ou6> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (it.next().a == c3aVar.e()) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                ss8 ss8Var = this.$listState;
                o97 o97Var = this.$theme;
                this.label = 1;
                o97.g gVar = o97Var.i;
                Object objC = vu6.c(ss8Var, i2, 48.0f, this);
                g13 g13Var = g13.a;
                if (objC == g13Var) {
                    return g13Var;
                }
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
