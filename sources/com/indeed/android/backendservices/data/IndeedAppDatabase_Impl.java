package com.indeed.android.backendservices.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import defpackage.aig;
import defpackage.ak2;
import defpackage.at5;
import defpackage.by3;
import defpackage.eig;
import defpackage.f77;
import defpackage.g77;
import defpackage.gfd;
import defpackage.km7;
import defpackage.m7f;
import defpackage.nkd;
import defpackage.pg8;
import defpackage.qf3;
import defpackage.qze;
import defpackage.tze;
import defpackage.v40;
import defpackage.wca;
import defpackage.wda;
import defpackage.yx3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class IndeedAppDatabase_Impl extends IndeedAppDatabase {
    public volatile by3 l;
    public volatile wda m;
    public volatile eig n;

    public class a extends gfd.a {
        public a() {
            super(10);
        }

        @Override // gfd.a
        public final void a(at5 at5Var) {
            SQLiteDatabase sQLiteDatabase = at5Var.a;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SavedJob` (`uid` TEXT NOT NULL, `state` TEXT NOT NULL, `lastUpdateTime` INTEGER NOT NULL, `displayTitle` TEXT, `page` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `DeletedRecentSearch` (`uid` TEXT NOT NULL, `accountId` TEXT NOT NULL, `whatQuery` TEXT NOT NULL, `whereQuery` TEXT NOT NULL, `searchTimestamp` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`uid`))");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_DeletedRecentSearch_accountId_whatQuery_whereQuery` ON `DeletedRecentSearch` (`accountId`, `whatQuery`, `whereQuery`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `HamburgerMenuItem` (`id` TEXT NOT NULL, `isLoggedIn` INTEGER NOT NULL, `locale` TEXT NOT NULL, `destinationUrl` TEXT NOT NULL, `label` TEXT NOT NULL, `subtitle` TEXT, PRIMARY KEY(`id`, `isLoggedIn`, `locale`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `NavBarLeftItem` (`id` TEXT NOT NULL, `destinationUrl` TEXT NOT NULL, `label` TEXT NOT NULL, `logoUrl` TEXT, PRIMARY KEY(`id`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `NavBarRightItem` (`id` TEXT NOT NULL, `destinationUrl` TEXT NOT NULL, `label` TEXT NOT NULL, PRIMARY KEY(`id`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `CountrySiteItem` (`locale` TEXT NOT NULL, `countryCode` TEXT NOT NULL, `countryName` TEXT NOT NULL, `baseUrl` TEXT NOT NULL, `supportedLanguageCodes` TEXT NOT NULL, `supportedLanguages` TEXT NOT NULL, PRIMARY KEY(`locale`, `countryCode`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `UrlRegistryItem` (`id` TEXT NOT NULL, `locale` TEXT NOT NULL, `destinationUrl` TEXT NOT NULL, `label` TEXT, PRIMARY KEY(`id`, `locale`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `HamburgerMenuCategory` (`id` TEXT NOT NULL, `label` TEXT, `isLoggedIn` INTEGER NOT NULL, `locale` TEXT NOT NULL, PRIMARY KEY(`id`, `isLoggedIn`, `locale`))");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `CategorizedHamburgerMenuItem` (`id` TEXT NOT NULL, `categoryId` TEXT NOT NULL, `isLoggedIn` INTEGER NOT NULL, `locale` TEXT NOT NULL, `destinationUrl` TEXT NOT NULL, `label` TEXT NOT NULL, `subtitle` TEXT, PRIMARY KEY(`id`, `isLoggedIn`, `locale`), FOREIGN KEY(`categoryId`, `isLoggedIn`, `locale`) REFERENCES `HamburgerMenuCategory`(`id`, `isLoggedIn`, `locale`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_CategorizedHamburgerMenuItem_categoryId` ON `CategorizedHamburgerMenuItem` (`categoryId`)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '20b4d574e291586b6d45c199b0b73e12')");
        }

        @Override // gfd.a
        public final void b(at5 at5Var) {
            SQLiteDatabase sQLiteDatabase = at5Var.a;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SavedJob`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `DeletedRecentSearch`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `HamburgerMenuItem`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `NavBarLeftItem`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `NavBarRightItem`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `CountrySiteItem`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `UrlRegistryItem`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `HamburgerMenuCategory`");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `CategorizedHamburgerMenuItem`");
        }

        @Override // gfd.a
        public final void c() {
        }

        @Override // gfd.a
        public final void d(at5 at5Var) {
            at5Var.a.execSQL("PRAGMA foreign_keys = ON");
            IndeedAppDatabase_Impl.this.t(new qze(at5Var));
        }

        @Override // gfd.a
        public final void e(at5 at5Var) {
            pg8.n(new qze(at5Var));
        }

        @Override // gfd.a
        public final gfd.b f(at5 at5Var) {
            HashMap map = new HashMap(6);
            map.put("uid", new m7f.a(1, 1, "uid", "TEXT", null, true));
            map.put("state", new m7f.a(0, 1, "state", "TEXT", null, true));
            map.put("lastUpdateTime", new m7f.a(0, 1, "lastUpdateTime", "INTEGER", null, true));
            map.put("displayTitle", new m7f.a(0, 1, "displayTitle", "TEXT", null, false));
            map.put("page", new m7f.a(0, 1, "page", "TEXT", null, true));
            map.put("createdAt", new m7f.a(0, 1, "createdAt", "INTEGER", null, true));
            m7f m7fVar = new m7f("SavedJob", map, new HashSet(0), new HashSet(0));
            m7f m7fVarA = m7f.a(at5Var, "SavedJob");
            if (!m7fVar.equals(m7fVarA)) {
                return new gfd.b(v40.f("SavedJob(com.indeed.android.backendservices.data.SavedJob).\n Expected:\n", m7fVar, "\n Found:\n", m7fVarA), false);
            }
            HashMap map2 = new HashMap(6);
            map2.put("uid", new m7f.a(1, 1, "uid", "TEXT", null, true));
            map2.put("accountId", new m7f.a(0, 1, "accountId", "TEXT", null, true));
            map2.put("whatQuery", new m7f.a(0, 1, "whatQuery", "TEXT", null, true));
            map2.put("whereQuery", new m7f.a(0, 1, "whereQuery", "TEXT", null, true));
            map2.put("searchTimestamp", new m7f.a(0, 1, "searchTimestamp", "INTEGER", null, true));
            map2.put("createdAt", new m7f.a(0, 1, "createdAt", "INTEGER", null, true));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new m7f.d("index_DeletedRecentSearch_accountId_whatQuery_whereQuery", true, Arrays.asList("accountId", "whatQuery", "whereQuery"), Arrays.asList("ASC", "ASC", "ASC")));
            m7f m7fVar2 = new m7f("DeletedRecentSearch", map2, hashSet, hashSet2);
            m7f m7fVarA2 = m7f.a(at5Var, "DeletedRecentSearch");
            if (!m7fVar2.equals(m7fVarA2)) {
                return new gfd.b(v40.f("DeletedRecentSearch(com.indeed.android.backendservices.data.searchoverlay.DeletedRecentSearch).\n Expected:\n", m7fVar2, "\n Found:\n", m7fVarA2), false);
            }
            HashMap map3 = new HashMap(6);
            map3.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
            map3.put("isLoggedIn", new m7f.a(2, 1, "isLoggedIn", "INTEGER", null, true));
            map3.put("locale", new m7f.a(3, 1, "locale", "TEXT", null, true));
            map3.put("destinationUrl", new m7f.a(0, 1, "destinationUrl", "TEXT", null, true));
            map3.put("label", new m7f.a(0, 1, "label", "TEXT", null, true));
            map3.put("subtitle", new m7f.a(0, 1, "subtitle", "TEXT", null, false));
            m7f m7fVar3 = new m7f("HamburgerMenuItem", map3, new HashSet(0), new HashSet(0));
            m7f m7fVarA3 = m7f.a(at5Var, "HamburgerMenuItem");
            if (!m7fVar3.equals(m7fVarA3)) {
                return new gfd.b(v40.f("HamburgerMenuItem(com.indeed.android.backendservices.data.navigationmenu.HamburgerMenuItem).\n Expected:\n", m7fVar3, "\n Found:\n", m7fVarA3), false);
            }
            HashMap map4 = new HashMap(4);
            map4.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
            map4.put("destinationUrl", new m7f.a(0, 1, "destinationUrl", "TEXT", null, true));
            map4.put("label", new m7f.a(0, 1, "label", "TEXT", null, true));
            map4.put("logoUrl", new m7f.a(0, 1, "logoUrl", "TEXT", null, false));
            m7f m7fVar4 = new m7f("NavBarLeftItem", map4, new HashSet(0), new HashSet(0));
            m7f m7fVarA4 = m7f.a(at5Var, "NavBarLeftItem");
            if (!m7fVar4.equals(m7fVarA4)) {
                return new gfd.b(v40.f("NavBarLeftItem(com.indeed.android.backendservices.data.navigationmenu.NavBarLeftItem).\n Expected:\n", m7fVar4, "\n Found:\n", m7fVarA4), false);
            }
            HashMap map5 = new HashMap(3);
            map5.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
            map5.put("destinationUrl", new m7f.a(0, 1, "destinationUrl", "TEXT", null, true));
            map5.put("label", new m7f.a(0, 1, "label", "TEXT", null, true));
            m7f m7fVar5 = new m7f("NavBarRightItem", map5, new HashSet(0), new HashSet(0));
            m7f m7fVarA5 = m7f.a(at5Var, "NavBarRightItem");
            if (!m7fVar5.equals(m7fVarA5)) {
                return new gfd.b(v40.f("NavBarRightItem(com.indeed.android.backendservices.data.navigationmenu.NavBarRightItem).\n Expected:\n", m7fVar5, "\n Found:\n", m7fVarA5), false);
            }
            HashMap map6 = new HashMap(6);
            map6.put("locale", new m7f.a(1, 1, "locale", "TEXT", null, true));
            map6.put("countryCode", new m7f.a(2, 1, "countryCode", "TEXT", null, true));
            map6.put("countryName", new m7f.a(0, 1, "countryName", "TEXT", null, true));
            map6.put("baseUrl", new m7f.a(0, 1, "baseUrl", "TEXT", null, true));
            map6.put("supportedLanguageCodes", new m7f.a(0, 1, "supportedLanguageCodes", "TEXT", null, true));
            map6.put("supportedLanguages", new m7f.a(0, 1, "supportedLanguages", "TEXT", null, true));
            m7f m7fVar6 = new m7f("CountrySiteItem", map6, new HashSet(0), new HashSet(0));
            m7f m7fVarA6 = m7f.a(at5Var, "CountrySiteItem");
            if (!m7fVar6.equals(m7fVarA6)) {
                return new gfd.b(v40.f("CountrySiteItem(com.indeed.android.backendservices.data.navigationmenu.CountrySiteItem).\n Expected:\n", m7fVar6, "\n Found:\n", m7fVarA6), false);
            }
            HashMap map7 = new HashMap(4);
            map7.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
            map7.put("locale", new m7f.a(2, 1, "locale", "TEXT", null, true));
            map7.put("destinationUrl", new m7f.a(0, 1, "destinationUrl", "TEXT", null, true));
            map7.put("label", new m7f.a(0, 1, "label", "TEXT", null, false));
            m7f m7fVar7 = new m7f("UrlRegistryItem", map7, new HashSet(0), new HashSet(0));
            m7f m7fVarA7 = m7f.a(at5Var, "UrlRegistryItem");
            if (!m7fVar7.equals(m7fVarA7)) {
                return new gfd.b(v40.f("UrlRegistryItem(com.indeed.android.backendservices.data.urlregistry.UrlRegistryItem).\n Expected:\n", m7fVar7, "\n Found:\n", m7fVarA7), false);
            }
            HashMap map8 = new HashMap(4);
            map8.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
            map8.put("label", new m7f.a(0, 1, "label", "TEXT", null, false));
            map8.put("isLoggedIn", new m7f.a(2, 1, "isLoggedIn", "INTEGER", null, true));
            map8.put("locale", new m7f.a(3, 1, "locale", "TEXT", null, true));
            m7f m7fVar8 = new m7f("HamburgerMenuCategory", map8, new HashSet(0), new HashSet(0));
            m7f m7fVarA8 = m7f.a(at5Var, "HamburgerMenuCategory");
            if (!m7fVar8.equals(m7fVarA8)) {
                return new gfd.b(v40.f("HamburgerMenuCategory(com.indeed.android.backendservices.data.navigationmenu.HamburgerMenuCategory).\n Expected:\n", m7fVar8, "\n Found:\n", m7fVarA8), false);
            }
            HashMap map9 = new HashMap(7);
            map9.put("id", new m7f.a(1, 1, "id", "TEXT", null, true));
            map9.put("categoryId", new m7f.a(0, 1, "categoryId", "TEXT", null, true));
            map9.put("isLoggedIn", new m7f.a(2, 1, "isLoggedIn", "INTEGER", null, true));
            map9.put("locale", new m7f.a(3, 1, "locale", "TEXT", null, true));
            map9.put("destinationUrl", new m7f.a(0, 1, "destinationUrl", "TEXT", null, true));
            map9.put("label", new m7f.a(0, 1, "label", "TEXT", null, true));
            map9.put("subtitle", new m7f.a(0, 1, "subtitle", "TEXT", null, false));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new m7f.c(Arrays.asList("categoryId", "isLoggedIn", "locale"), Arrays.asList("id", "isLoggedIn", "locale"), "HamburgerMenuCategory", "CASCADE", "NO ACTION"));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new m7f.d("index_CategorizedHamburgerMenuItem_categoryId", false, Arrays.asList("categoryId"), Arrays.asList("ASC")));
            m7f m7fVar9 = new m7f("CategorizedHamburgerMenuItem", map9, hashSet3, hashSet4);
            m7f m7fVarA9 = m7f.a(at5Var, "CategorizedHamburgerMenuItem");
            return !m7fVar9.equals(m7fVarA9) ? new gfd.b(v40.f("CategorizedHamburgerMenuItem(com.indeed.android.backendservices.data.navigationmenu.CategorizedHamburgerMenuItem).\n Expected:\n", m7fVar9, "\n Found:\n", m7fVarA9), false) : new gfd.b(null, true);
        }
    }

    @Override // com.indeed.android.backendservices.data.IndeedAppDatabase
    public final aig A() {
        eig eigVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new eig(this);
                }
                eigVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eigVar;
    }

    @Override // defpackage.xed
    public final km7 f() {
        return new km7(this, new HashMap(0), new HashMap(0), "SavedJob", "DeletedRecentSearch", "HamburgerMenuItem", "NavBarLeftItem", "NavBarRightItem", "CountrySiteItem", "UrlRegistryItem", "HamburgerMenuCategory", "CategorizedHamburgerMenuItem");
    }

    @Override // defpackage.xed
    public final tze h(qf3 qf3Var) {
        gfd gfdVar = new gfd(qf3Var, new a(), "20b4d574e291586b6d45c199b0b73e12", "ed113b79b55c21587695a9c602717d00");
        Context context = qf3Var.a;
        context.getClass();
        return qf3Var.c.c(new tze.b(context, qf3Var.b, gfdVar, false, false));
    }

    @Override // defpackage.xed
    public final List i(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f77(1, 2));
        arrayList.add(new g77(2, 3));
        return arrayList;
    }

    @Override // defpackage.xed
    public final Set<Class<? extends ak2>> n() {
        return new HashSet();
    }

    @Override // defpackage.xed
    public final Map<Class<?>, List<Class<?>>> p() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(nkd.class, list);
        map.put(yx3.class, list);
        map.put(wca.class, list);
        map.put(aig.class, list);
        return map;
    }

    @Override // com.indeed.android.backendservices.data.IndeedAppDatabase
    public final yx3 y() {
        by3 by3Var;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new by3(this);
                }
                by3Var = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return by3Var;
    }

    @Override // com.indeed.android.backendservices.data.IndeedAppDatabase
    public final wca z() {
        wda wdaVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new wda(this);
                }
                wdaVar = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wdaVar;
    }
}
