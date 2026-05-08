package defpackage;

import android.icu.util.ULocale;
import android.text.TextUtils;
import com.facebook.hermes.intl.JSRangeErrorException;
import defpackage.d6g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class g19 implements in6<ULocale> {
    public ULocale a;
    public ULocale.Builder b = null;
    public boolean c = false;

    public g19(ULocale uLocale) {
        this.a = uLocale;
    }

    @Override // defpackage.in6
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final HashMap<String, String> mo34a() throws JSRangeErrorException {
        f();
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> keywords = this.a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                d6g.b bVar = d6g.b;
                map.put(bVar.containsKey(next) ? bVar.get(next) : next, this.a.getKeywordValue(next));
            }
        }
        return map;
    }

    @Override // defpackage.in6
    public final ULocale b() throws JSRangeErrorException {
        f();
        return this.a;
    }

    @Override // defpackage.in6
    public final g19 c() throws JSRangeErrorException {
        f();
        return new g19(this.a);
    }

    @Override // defpackage.in6
    public final void d(String str, ArrayList<String> arrayList) throws JSRangeErrorException {
        f();
        if (this.b == null) {
            this.b = new ULocale.Builder().setLocale(this.a);
        }
        try {
            this.b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.c = true;
        } catch (RuntimeException e) {
            throw new JSRangeErrorException(e.getMessage());
        }
    }

    @Override // defpackage.in6
    public final String e() throws JSRangeErrorException {
        f();
        return this.a.toLanguageTag();
    }

    public final void f() throws JSRangeErrorException {
        if (this.c) {
            try {
                this.a = this.b.build();
                this.c = false;
            } catch (RuntimeException e) {
                throw new JSRangeErrorException(e.getMessage());
            }
        }
    }

    public final ULocale g() throws JSRangeErrorException {
        f();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.a);
        builder.clearExtensions();
        return builder.build();
    }

    @Override // defpackage.in6
    public final ArrayList a() throws JSRangeErrorException {
        f();
        d6g.a aVar = d6g.a;
        String str = aVar.containsKey("collation") ? aVar.get("collation") : "collation";
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.a.getKeywordValue(str);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }
}
