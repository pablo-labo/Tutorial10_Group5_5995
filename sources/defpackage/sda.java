package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sda extends qv4<o23> {
    @Override // defpackage.ha1
    public final String d() {
        return "INSERT OR REPLACE INTO `CountrySiteItem` (`locale`,`countryCode`,`countryName`,`baseUrl`,`supportedLanguageCodes`,`supportedLanguages`) VALUES (?,?,?,?,?,?)";
    }

    @Override // defpackage.qv4
    public final void h(zze zzeVar, o23 o23Var) {
        o23 o23Var2 = o23Var;
        zzeVar.n(1, o23Var2.a);
        zzeVar.n(2, o23Var2.b);
        zzeVar.n(3, o23Var2.c);
        zzeVar.n(4, o23Var2.d);
        List<String> list = o23Var2.e;
        list.getClass();
        String strF = new ae6().f(list);
        strF.getClass();
        zzeVar.n(5, strF);
        List<String> list2 = o23Var2.f;
        list2.getClass();
        String strF2 = new ae6().f(list2);
        strF2.getClass();
        zzeVar.n(6, strF2);
    }
}
