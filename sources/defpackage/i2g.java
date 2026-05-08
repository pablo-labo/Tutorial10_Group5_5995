package defpackage;

import defpackage.xh8;

/* JADX INFO: loaded from: classes2.dex */
public final class i2g implements h2g, xh8 {
    public static int j() {
        int iK = k("app_population_allocations_droid");
        if (iK == 1) {
            return k("max_nav_logic_droid");
        }
        if (iK == 2) {
            return k("stable_app_nav_logic_droid");
        }
        if (iK == 3) {
            return k("shared_experimental_nav_logic_droid");
        }
        if (iK != 4) {
            return -1;
        }
        return k("companion_nav_logic_droid");
    }

    public static int k(String str) {
        return ((kr7) cr8.p(kr7.class)).e(str).a;
    }

    public static int l() {
        int iK = k("app_population_allocations_droid");
        if (iK == 1) {
            return k("max_tab_config_droid");
        }
        if (iK == 2) {
            return k("stable_app_tab_config_droid");
        }
        if (iK == 3) {
            return k("shared_experimental_tab_config_droid");
        }
        if (iK != 4) {
            return -1;
        }
        return k("companion_tab_config_droid");
    }

    @Override // defpackage.h2g
    public final boolean a() {
        if (!pyd.h0) {
            return false;
        }
        int iK = k("app_population_allocations_droid");
        int iL = l();
        if (iK != 1) {
            if (iK != 2) {
                if (iK != 3) {
                    if (iK != 4 || iL != 6) {
                        return false;
                    }
                } else if (iL != 6) {
                    return false;
                }
            } else if (iL != 11) {
                return false;
            }
        } else if (iL != 7) {
            return false;
        }
        return true;
    }

    @Override // defpackage.h2g
    public final boolean b() {
        int iJ = j();
        return iJ == 3 || iJ >= 10;
    }

    @Override // defpackage.h2g
    public final boolean c() {
        int iK = k("app_population_allocations_droid");
        return (iK != 1 ? iK != 2 ? iK != 3 ? iK != 4 ? -1 : k("companion_nav_logic_droid") : k("shared_experimental_nav_logic_droid") : k("stable_app_nav_logic_droid") : k("max_nav_logic_droid")) == 21;
    }

    @Override // defpackage.h2g
    public final boolean e() {
        return j() == 11;
    }

    @Override // defpackage.h2g
    public final boolean f() {
        int iK = k("app_population_allocations_droid");
        return (iK != 1 ? iK != 2 ? iK != 3 ? iK != 4 ? -1 : k("companion_nav_logic_droid") : k("shared_experimental_nav_logic_droid") : k("stable_app_nav_logic_droid") : k("max_nav_logic_droid")) == 16;
    }

    @Override // defpackage.h2g
    public final boolean g() {
        int iK = k("app_population_allocations_droid");
        int iK2 = iK != 1 ? iK != 2 ? iK != 3 ? iK != 4 ? -1 : k("companion_nav_logic_droid") : k("shared_experimental_nav_logic_droid") : k("stable_app_nav_logic_droid") : k("max_nav_logic_droid");
        return iK2 == 18 || iK2 == 19;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.h2g
    public final boolean h() {
        if (!pyd.h0) {
            return false;
        }
        if (l() != 4 && !a()) {
            if (!pyd.h0) {
                return false;
            }
            int iK = k("app_population_allocations_droid");
            int iL = l();
            if (iK != 1) {
                if (iK != 2) {
                    if (iK != 3) {
                        if (iK != 4 || iL != 7) {
                            return false;
                        }
                    } else if (iL != 7) {
                        return false;
                    }
                } else if (iL != 12) {
                    return false;
                }
            } else if (iL != 6) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.h2g
    public final boolean i() {
        int iJ = j();
        return iJ == 5 || iJ >= 10;
    }
}
