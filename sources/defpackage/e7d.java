package defpackage;

import android.util.Log;
import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class e7d {

    @uh3(c = "com.indeed.android.messaging.ui.common.ResponsiveBannerKt$ResponsiveBanner$1$1", f = "ResponsiveBanner.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ f7d $bannerState;
        final /* synthetic */ boolean $isInbox;
        final /* synthetic */ i7d $responsivenessUiState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f7d f7dVar, i7d i7dVar, boolean z, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$bannerState = f7dVar;
            this.$responsivenessUiState = i7dVar;
            this.$isInbox = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$bannerState, this.$responsivenessUiState, this.$isInbox, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            ArrayList arrayList = lz2.a;
            f7d f7dVar = this.$bannerState;
            i7d i7dVar = this.$responsivenessUiState;
            Log.d("ResponsiveBanner", "bannerState: " + f7dVar + ", output: " + i7dVar.c + ", isEarned: " + i7dVar.b, null);
            i7d i7dVar2 = this.$responsivenessUiState;
            if (!i7dVar2.e) {
                return j6g.a;
            }
            if (!i7dVar2.b && this.$bannerState.b() && this.$responsivenessUiState.c > 0) {
                Log.d("ResponsiveBanner", "Earn banner", null);
                f7d.c(this.$bannerState, true, null, new Integer(!this.$isInbox ? R.string.messaging_responsive_banner_conversation : R.string.messaging_responsive_banner_inbox), 2);
            }
            if (this.$responsivenessUiState.b && this.$bannerState.b()) {
                i7d i7dVar3 = this.$responsivenessUiState;
                if (i7dVar3.c > 0 && i7dVar3.d == 0) {
                    Log.d("ResponsiveBanner", "Keep banner", null);
                    f7d.c(this.$bannerState, true, null, new Integer(R.string.messaging_responsive_banner_keep), 2);
                }
            }
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.i7d r16, boolean r17, final defpackage.f7d r18, androidx.compose.runtime.b r19, final int r20, final int r21) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7d.a(i7d, boolean, f7d, androidx.compose.runtime.b, int, int):void");
    }

    public static final f7d b(b bVar) {
        Object[] objArr = new Object[0];
        ko2 ko2Var = f7d.e;
        Object objV = bVar.v();
        if (objV == b.a.a) {
            objV = new ag3(10);
            bVar.p(objV);
        }
        return (f7d) ypd.N(objArr, ko2Var, (gu5) objV, bVar, 0);
    }
}
