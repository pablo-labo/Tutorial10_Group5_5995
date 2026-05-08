package defpackage;

import defpackage.roa;
import java.text.NumberFormat;
import java.util.Currency;

/* JADX INFO: loaded from: classes3.dex */
public final class u83 implements ftg {
    public final NumberFormat a;

    public u83() {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(Currency.getInstance(nn2.E(((ep7) cr8.p(ep7.class)).b())));
        currencyInstance.setMaximumFractionDigits(0);
        this.a = currencyInstance;
    }

    @Override // defpackage.ftg
    public final vrf a(le0 le0Var) {
        le0Var.getClass();
        String string = zve.s0(le0Var.b).toString();
        if (string.length() == 0) {
            return new vrf(le0Var, roa.a.a);
        }
        String str = this.a.format(Integer.valueOf(Integer.parseInt(string)));
        str.getClass();
        return new vrf(new le0(str), new am2(string, str));
    }
}
