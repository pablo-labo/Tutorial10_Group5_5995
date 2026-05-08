package defpackage;

import android.database.Cursor;
import com.indeed.android.backendservices.data.IndeedAppDatabase_Impl;
import defpackage.mfd;
import defpackage.wca;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class wda implements wca {
    public final IndeedAppDatabase_Impl a;
    public final hda b;
    public final oda c;
    public final pda d;
    public final qda e;
    public final rda f;
    public final sda g;
    public final tda h;
    public final uda i;
    public final vda j;
    public final xca k;
    public final yca l;

    public wda(IndeedAppDatabase_Impl indeedAppDatabase_Impl) {
        this.a = indeedAppDatabase_Impl;
        this.b = new hda(indeedAppDatabase_Impl);
        int i = 0;
        this.c = new oda(indeedAppDatabase_Impl, i);
        this.d = new pda(indeedAppDatabase_Impl, i);
        this.e = new qda(indeedAppDatabase_Impl);
        this.f = new rda(indeedAppDatabase_Impl, i);
        this.g = new sda(indeedAppDatabase_Impl);
        this.h = new tda(indeedAppDatabase_Impl, i);
        this.i = new uda(indeedAppDatabase_Impl, i);
        this.j = new vda(indeedAppDatabase_Impl, i);
        this.k = new xca(indeedAppDatabase_Impl);
        this.l = new yca(indeedAppDatabase_Impl);
    }

    @Override // defpackage.wca
    public final Object a(ArrayList arrayList, wca.a.C0467a c0467a) {
        return k13.a.a(this.a, true, new ada(this, arrayList), c0467a);
    }

    @Override // defpackage.wca
    public final kl5 b() {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mda mdaVar = new mda(this, mfd.a.a(0, "SELECT * FROM HamburgerMenuCategory"));
        return k13.a(this.a, true, new String[]{"CategorizedHamburgerMenuItem", "HamburgerMenuCategory"}, mdaVar);
    }

    @Override // defpackage.wca
    public final Object c(List list, fca fcaVar) {
        return k13.a.a(this.a, true, new eda(this, list), fcaVar);
    }

    @Override // defpackage.wca
    public final Object d(fca fcaVar) {
        return k13.a.a(this.a, true, new ida(this), fcaVar);
    }

    @Override // defpackage.wca
    public final kl5 e() {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        nda ndaVar = new nda(this, mfd.a.a(0, "SELECT * FROM CountrySiteItem"));
        return k13.a(this.a, false, new String[]{"CountrySiteItem"}, ndaVar);
    }

    @Override // defpackage.wca
    public final Object f(String str, fca fcaVar) {
        return k13.a.a(this.a, true, new kda(str, 0, this), fcaVar);
    }

    @Override // defpackage.wca
    public final Object g(List list, fca fcaVar) {
        return k13.a.a(this.a, true, new zca(this, list), fcaVar);
    }

    @Override // defpackage.wca
    public final kl5 h() {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        lda ldaVar = new lda(this, mfd.a.a(0, "SELECT * FROM HamburgerMenuItem"), 0);
        return k13.a(this.a, false, new String[]{"HamburgerMenuItem"}, ldaVar);
    }

    @Override // defpackage.wca
    public final Object i(List list, fca fcaVar) {
        return k13.a.a(this.a, true, new cda(this, list), fcaVar);
    }

    @Override // defpackage.wca
    public final ArrayList j() throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(0, "SELECT * FROM NavBarRightItem");
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = this.a;
        indeedAppDatabase_Impl.b();
        Cursor cursorI = pg8.I(indeedAppDatabase_Impl, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "id");
            int iB2 = r93.b(cursorI, "destinationUrl");
            int iB3 = r93.b(cursorI, "label");
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(new uaa(cursorI.getString(iB), cursorI.getString(iB2), cursorI.getString(iB3)));
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.wca
    public final Object k(List list, fca fcaVar) {
        return k13.a.a(this.a, true, new dda(this, list), fcaVar);
    }

    @Override // defpackage.wca
    public final ArrayList l() throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(0, "SELECT * FROM NavBarLeftItem");
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = this.a;
        indeedAppDatabase_Impl.b();
        Cursor cursorI = pg8.I(indeedAppDatabase_Impl, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "id");
            int iB2 = r93.b(cursorI, "destinationUrl");
            int iB3 = r93.b(cursorI, "label");
            int iB4 = r93.b(cursorI, "logoUrl");
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(new taa(cursorI.getString(iB), cursorI.getString(iB2), cursorI.getString(iB3), cursorI.isNull(iB4) ? null : cursorI.getString(iB4)));
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.wca
    public final Object m(boolean z, String str, fca fcaVar) {
        return k13.a.a(this.a, true, new gda(this, z, str), fcaVar);
    }

    @Override // defpackage.wca
    public final ArrayList n() throws Throwable {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(0, "SELECT * FROM HamburgerMenuCategory");
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = this.a;
        indeedAppDatabase_Impl.b();
        indeedAppDatabase_Impl.c();
        try {
            Cursor cursorI = pg8.I(indeedAppDatabase_Impl, mfdVarA, true);
            try {
                int iB = r93.b(cursorI, "id");
                int iB2 = r93.b(cursorI, "label");
                int iB3 = r93.b(cursorI, "isLoggedIn");
                int iB4 = r93.b(cursorI, "locale");
                HashMap<String, ArrayList<xy1>> map = new HashMap<>();
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(iB);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                }
                cursorI.moveToPosition(-1);
                t(map);
                ArrayList arrayList = new ArrayList(cursorI.getCount());
                while (cursorI.moveToNext()) {
                    arrayList.add(new we6(new ve6(cursorI.getString(iB), cursorI.isNull(iB2) ? null : cursorI.getString(iB2), cursorI.getString(iB4), cursorI.getInt(iB3) != 0), map.get(cursorI.getString(iB))));
                }
                indeedAppDatabase_Impl.w();
                cursorI.close();
                mfdVarA.s();
                return arrayList;
            } catch (Throwable th) {
                cursorI.close();
                mfdVarA.s();
                throw th;
            }
        } finally {
            indeedAppDatabase_Impl.s();
        }
    }

    @Override // defpackage.wca
    public final Object o(fca fcaVar) {
        return k13.a.a(this.a, true, new jda(this, 0), fcaVar);
    }

    @Override // defpackage.wca
    public final Object p(List list, fca fcaVar) {
        mz4 mz4Var = new mz4(2, this, list);
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = this.a;
        return web.I(indeedAppDatabase_Impl, new bfd(indeedAppDatabase_Impl, mz4Var, null), fcaVar);
    }

    @Override // defpackage.wca
    public final Object q(ArrayList arrayList, wca.a.C0467a c0467a) {
        return k13.a.a(this.a, true, new bda(this, arrayList), c0467a);
    }

    @Override // defpackage.wca
    public final ArrayList r() throws IOException {
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(0, "SELECT * FROM HamburgerMenuItem");
        IndeedAppDatabase_Impl indeedAppDatabase_Impl = this.a;
        indeedAppDatabase_Impl.b();
        Cursor cursorI = pg8.I(indeedAppDatabase_Impl, mfdVarA, false);
        try {
            int iB = r93.b(cursorI, "id");
            int iB2 = r93.b(cursorI, "isLoggedIn");
            int iB3 = r93.b(cursorI, "locale");
            int iB4 = r93.b(cursorI, "destinationUrl");
            int iB5 = r93.b(cursorI, "label");
            int iB6 = r93.b(cursorI, "subtitle");
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(new xe6(cursorI.getString(iB), cursorI.getString(iB3), cursorI.getInt(iB2) != 0, cursorI.getString(iB4), cursorI.getString(iB5), cursorI.isNull(iB6) ? null : cursorI.getString(iB6)));
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.wca
    public final Object s(boolean z, String str, fca fcaVar) {
        return k13.a.a(this.a, true, new fda(this, z, str), fcaVar);
    }

    public final void t(HashMap<String, ArrayList<xy1>> map) throws IOException {
        int i;
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            HashMap<String, ArrayList<xy1>> map2 = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : map.keySet()) {
                    str.getClass();
                    map2.put(str, map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                t(map2);
                j6g j6gVar = j6g.a;
                map2.clear();
            }
            if (i > 0) {
                t(map2);
                j6g j6gVar2 = j6g.a;
                return;
            }
            return;
        }
        StringBuilder sbG = q6.g("SELECT `id`,`categoryId`,`isLoggedIn`,`locale`,`destinationUrl`,`label`,`subtitle` FROM `CategorizedHamburgerMenuItem` WHERE `categoryId` IN (");
        int size = setKeySet.size();
        dmc.c(size, sbG);
        sbG.append(")");
        String string = sbG.toString();
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(size, string);
        Iterator<String> it = setKeySet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            mfdVarA.n(i2, it.next());
            i2++;
        }
        Cursor cursorI = pg8.I(this.a, mfdVarA, false);
        try {
            int iA = r93.a(cursorI, "categoryId");
            if (iA == -1) {
                cursorI.close();
                return;
            }
            while (cursorI.moveToNext()) {
                ArrayList<xy1> arrayList = map.get(cursorI.getString(iA));
                if (arrayList != null) {
                    arrayList.add(new xy1(cursorI.getString(0), cursorI.getString(1), cursorI.getInt(2) != 0, cursorI.getString(3), cursorI.getString(4), cursorI.getString(5), cursorI.isNull(6) ? null : cursorI.getString(6)));
                }
            }
        } finally {
            cursorI.close();
        }
    }
}
