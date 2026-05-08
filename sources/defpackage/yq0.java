package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class yq0 implements xu5<xo8, Integer, b, Integer, j6g> {
    public final /* synthetic */ kjg V;
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ e13 c;
    public final /* synthetic */ ude d;
    public final /* synthetic */ e8a e;
    public final /* synthetic */ fr0 f;

    public yq0(ArrayList arrayList, Context context, e13 e13Var, ude udeVar, e8a e8aVar, fr0 fr0Var, kjg kjgVar) {
        this.a = arrayList;
        this.b = context;
        this.c = e13Var;
        this.d = udeVar;
        this.e = e8aVar;
        this.f = fr0Var;
        this.V = kjgVar;
    }

    @Override // defpackage.xu5
    public final j6g j(xo8 xo8Var, Integer num, b bVar, Integer num2) throws UnsupportedEncodingException {
        int i;
        xo8 xo8Var2 = xo8Var;
        int iIntValue = num.intValue();
        b bVar2 = bVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= bVar2.d(iIntValue) ? 32 : 16;
        }
        if (bVar2.o(i & 1, (i & 147) != 146)) {
            SavedJobsDto savedJobsDto = (SavedJobsDto) this.a.get(iIntValue);
            bVar2.L(-2038907511);
            qq0.g(savedJobsDto, this.b, this.c, this.d, this.e, this.f, iIntValue, false, this.V, bVar2, ((i & 126) << 15) & 3670016);
            bVar2.F();
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
