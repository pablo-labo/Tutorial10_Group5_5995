package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import defpackage.akb;
import defpackage.l5;
import defpackage.w20;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final w d;
    public final Pools$SimplePool a = new Pools$SimplePool(30);
    public final ArrayList<C0075a> b = new ArrayList<>();
    public final ArrayList<C0075a> c = new ArrayList<>();
    public int f = 0;
    public final p e = new p(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static final class C0075a {
        public int a;
        public int b;
        public int c;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C0075a)) {
                    return false;
                }
                C0075a c0075a = (C0075a) obj;
                int i = this.a;
                if (i != c0075a.a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.c - this.b) != 1 || this.c != c0075a.b || this.b != c0075a.c) {
                    return this.c == c0075a.c && this.b == c0075a.b;
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : GesturesListener.SCROLL_DIRECTION_UP : "rm" : "add");
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            return w20.k(sb, this.c, ",p:null]");
        }
    }

    public a(w wVar) {
        this.d = wVar;
    }

    public final boolean a(int i) {
        ArrayList<C0075a> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0075a c0075a = arrayList.get(i2);
            int i3 = c0075a.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0075a.b;
                    int i5 = c0075a.c + i4;
                    while (i4 < i5) {
                        if (f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0075a.c, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0075a> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a(arrayList.get(i));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0075a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0075a c0075a = arrayList.get(i);
            int i2 = c0075a.a;
            w wVar = this.d;
            if (i2 == 1) {
                wVar.a(c0075a);
                wVar.d(c0075a.b, c0075a.c);
            } else if (i2 == 2) {
                wVar.a(c0075a);
                int i3 = c0075a.b;
                int i4 = c0075a.c;
                RecyclerView recyclerView = wVar.a;
                recyclerView.S(i3, i4, true);
                recyclerView.a1 = true;
                recyclerView.X0.c += i4;
            } else if (i2 == 4) {
                wVar.a(c0075a);
                wVar.c(c0075a.b, c0075a.c);
            } else if (i2 == 8) {
                wVar.a(c0075a);
                wVar.e(c0075a.b, c0075a.c);
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(C0075a c0075a) {
        int i;
        Pools$SimplePool pools$SimplePool;
        int i2 = c0075a.a;
        if (i2 == 1 || i2 == 8) {
            l5.q("should not dispatch add or move for pre layout");
            return;
        }
        int iL = l(c0075a.b, i2);
        int i3 = c0075a.b;
        int i4 = c0075a.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                akb.o(c0075a, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0075a.c;
            pools$SimplePool = this.a;
            if (i5 >= i7) {
                break;
            }
            int iL2 = l((i * i5) + c0075a.b, c0075a.a);
            int i8 = c0075a.a;
            if (i8 == 2 ? iL2 != iL : !(i8 == 4 && iL2 == iL + 1)) {
                C0075a c0075aH = h(i8, iL, i6);
                e(c0075aH, i3);
                pools$SimplePool.a(c0075aH);
                if (c0075a.a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                iL = iL2;
            } else {
                i6++;
            }
            i5++;
        }
        pools$SimplePool.a(c0075a);
        if (i6 > 0) {
            C0075a c0075aH2 = h(c0075a.a, iL, i6);
            e(c0075aH2, i3);
            pools$SimplePool.a(c0075aH2);
        }
    }

    public final void e(C0075a c0075a, int i) {
        w wVar = this.d;
        wVar.a(c0075a);
        int i2 = c0075a.a;
        if (i2 != 2) {
            if (i2 == 4) {
                wVar.c(i, c0075a.c);
                return;
            } else {
                l5.q("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = c0075a.c;
        RecyclerView recyclerView = wVar.a;
        recyclerView.S(i, i3, true);
        recyclerView.a1 = true;
        recyclerView.X0.c += i3;
    }

    public final int f(int i, int i2) {
        ArrayList<C0075a> arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            C0075a c0075a = arrayList.get(i2);
            int i3 = c0075a.a;
            int i4 = c0075a.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = c0075a.c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0075a.c <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = c0075a.c;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += c0075a.c;
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final C0075a h(int i, int i2, int i3) {
        C0075a c0075a = (C0075a) this.a.acquire();
        if (c0075a != null) {
            c0075a.a = i;
            c0075a.b = i2;
            c0075a.c = i3;
            return c0075a;
        }
        C0075a c0075a2 = new C0075a();
        c0075a2.a = i;
        c0075a2.b = i2;
        c0075a2.c = i3;
        return c0075a2;
    }

    public final void i(C0075a c0075a) {
        this.c.add(c0075a);
        int i = c0075a.a;
        w wVar = this.d;
        if (i == 1) {
            wVar.d(c0075a.b, c0075a.c);
            return;
        }
        if (i == 2) {
            int i2 = c0075a.b;
            int i3 = c0075a.c;
            RecyclerView recyclerView = wVar.a;
            recyclerView.S(i2, i3, false);
            recyclerView.a1 = true;
            return;
        }
        if (i == 4) {
            wVar.c(c0075a.b, c0075a.c);
        } else if (i == 8) {
            wVar.e(c0075a.b, c0075a.c);
        } else {
            akb.o(c0075a, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0075a c0075a = (C0075a) arrayList.get(i);
            c0075a.getClass();
            this.a.a(c0075a);
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList<C0075a> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0075a c0075a = arrayList.get(size);
            int i5 = c0075a.a;
            int i6 = c0075a.b;
            if (i5 == 8) {
                int i7 = c0075a.c;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0075a.b = i6 + 1;
                            c0075a.c = i7 + 1;
                        } else if (i2 == 2) {
                            c0075a.b = i6 - 1;
                            c0075a.c = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        c0075a.c = i7 + 1;
                    } else if (i2 == 2) {
                        c0075a.c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0075a.b = i6 + 1;
                    } else if (i2 == 2) {
                        c0075a.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= c0075a.c;
                } else if (i5 == 2) {
                    i += c0075a.c;
                }
            } else if (i2 == 1) {
                c0075a.b = i6 + 1;
            } else if (i2 == 2) {
                c0075a.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0075a c0075a2 = arrayList.get(size2);
            int i8 = c0075a2.a;
            int i9 = c0075a2.c;
            Pools$SimplePool pools$SimplePool = this.a;
            if (i8 == 8) {
                if (i9 == c0075a2.b || i9 < 0) {
                    arrayList.remove(size2);
                    pools$SimplePool.a(c0075a2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                pools$SimplePool.a(c0075a2);
            }
        }
        return i;
    }
}
