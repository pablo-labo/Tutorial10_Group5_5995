package defpackage;

import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import defpackage.lt7;
import defpackage.mt7;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ytd implements xu5 {
    public final /* synthetic */ SearchOverlayFragment a;

    public /* synthetic */ ytd(SearchOverlayFragment searchOverlayFragment) {
        this.a = searchOverlayFragment;
    }

    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        jud judVar = (jud) obj;
        kud kudVar = (kud) obj2;
        lsc lscVar = (lsc) obj3;
        Integer num = (Integer) obj4;
        judVar.getClass();
        kudVar.getClass();
        ArrayList arrayList = lz2.a;
        String str = judVar.a;
        String str2 = judVar.b;
        SearchOverlayFragment searchOverlayFragment = this.a;
        String str3 = searchOverlayFragment.Y;
        StringBuilder sbF = u40.f("Submitted search with args: what=", str, ", where=", str2, ", origin=");
        sbF.append(str3);
        sbF.append(", submission method=");
        sbF.append(kudVar);
        lz2.d("SearchOverlayFragment", sbF.toString(), false, null);
        List<String> list = bud.a;
        searchOverlayFragment.F(new lt7.b(new mt7.b(bud.a(((p87) searchOverlayFragment.c.getValue()).h(), judVar, searchOverlayFragment.I().m(), kudVar, searchOverlayFragment.Z, searchOverlayFragment.a0, searchOverlayFragment.Y, num, lscVar != null ? lscVar.d : null))));
        return j6g.a;
    }
}
