package defpackage;

import defpackage.xrf;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public final class ke9 implements je9 {
    public final Matcher a;
    public final CharSequence b;
    public final b c;
    public a d;

    public static final class a extends w2<String> {
        public a() {
        }

        @Override // defpackage.l1
        public final int a() {
            return ke9.this.a.groupCount() + 1;
        }

        @Override // defpackage.l1, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i) {
            String strGroup = ke9.this.a.group(i);
            return strGroup == null ? "" : strGroup;
        }

        @Override // defpackage.w2, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // defpackage.w2, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public static final class b extends l1<ie9> {
        public b() {
        }

        @Override // defpackage.l1
        public final int a() {
            return ke9.this.a.groupCount() + 1;
        }

        public final ie9 b(int i) {
            Matcher matcher = ke9.this.a;
            oh7 oh7VarH = nic.H(matcher.start(i), matcher.end(i));
            if (oh7VarH.a < 0) {
                return null;
            }
            String strGroup = matcher.group(i);
            strGroup.getClass();
            return new ie9(strGroup, oh7VarH);
        }

        @Override // defpackage.l1, java.util.Collection, java.util.Set
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof ie9) {
                return super.contains((ie9) obj);
            }
            return false;
        }

        @Override // defpackage.l1, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<ie9> iterator() {
            return new xrf.a(new xrf(new y92(u63.H(this)), new cu(this, 8)));
        }
    }

    public ke9(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new b();
    }

    @Override // defpackage.je9
    public final List<String> a() {
        if (this.d == null) {
            this.d = new a();
        }
        a aVar = this.d;
        aVar.getClass();
        return aVar;
    }

    @Override // defpackage.je9
    public final oh7 b() {
        Matcher matcher = this.a;
        return nic.H(matcher.start(), matcher.end());
    }

    @Override // defpackage.je9
    public final b c() {
        return this.c;
    }

    @Override // defpackage.je9
    public final String getValue() {
        String strGroup = this.a.group();
        strGroup.getClass();
        return strGroup;
    }

    @Override // defpackage.je9
    public final ke9 next() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new ke9(matcher2, charSequence);
        }
        return null;
    }
}
