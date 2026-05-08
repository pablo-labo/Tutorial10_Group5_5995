package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.e;
import defpackage.akb;
import defpackage.hh1;
import defpackage.koc;
import defpackage.l6;
import defpackage.loc;
import defpackage.mkf;
import defpackage.s55;
import defpackage.sqg;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static final class a implements e<koc<?>> {
        public final Map<String, e.l> a;

        public a(Class cls) {
            cls.getClass();
            Map<String, e.l> mapC = com.facebook.react.uimanager.e.c(cls);
            mapC.getClass();
            this.a = mapC;
        }

        @Override // com.facebook.react.uimanager.d.e
        public final void a(loc locVar, String str, Object obj) {
            Object[] objArr;
            str.getClass();
            e.l lVar = this.a.get(str);
            if (lVar != null) {
                String str2 = lVar.a;
                Integer num = lVar.d;
                try {
                    if (num == null) {
                        objArr = e.l.g.get();
                        mkf mkfVar = locVar.d;
                        hh1.n(mkfVar);
                        objArr[0] = lVar.a(obj, mkfVar);
                    } else {
                        Object[] objArr2 = e.l.h.get();
                        objArr2[0] = num;
                        mkf mkfVar2 = locVar.d;
                        hh1.n(mkfVar2);
                        objArr2[1] = lVar.a(obj, mkfVar2);
                        objArr = objArr2;
                    }
                    lVar.c.invoke(locVar, objArr);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th) {
                    s55.e(ViewManager.class, "Error while updating prop " + str2, th);
                    StringBuilder sbM = akb.m("Error while updating property '", str2, "' in shadow node of type: ");
                    String str3 = locVar.b;
                    hh1.n(str3);
                    sbM.append(str3);
                    throw new JSApplicationIllegalArgumentException(sbM.toString(), th);
                }
            }
        }

        @Override // com.facebook.react.uimanager.d.InterfaceC0137d
        public final void b(HashMap map) {
            for (e.l lVar : this.a.values()) {
                map.put(lVar.a, lVar.b);
            }
        }
    }

    public static final class b<V extends View> implements f<ViewManager<V, ?>, V> {
        public final Map<String, e.l> a;

        public b(Class<? extends ViewManager<V, ?>> cls) {
            Map<String, e.l> mapD = com.facebook.react.uimanager.e.d(cls);
            mapD.getClass();
            this.a = mapD;
        }

        @Override // com.facebook.react.uimanager.d.InterfaceC0137d
        public final void b(HashMap map) {
            for (e.l lVar : this.a.values()) {
                map.put(lVar.a, lVar.b);
            }
        }

        @Override // com.facebook.react.uimanager.d.f
        public final void c(ViewManager<V, ?> viewManager, V v, String str, Object obj) {
            Object[] objArr;
            e.l lVar = this.a.get(str);
            if (lVar != null) {
                String str2 = lVar.a;
                Integer num = lVar.d;
                try {
                    if (num == null) {
                        objArr = e.l.e.get();
                        objArr[0] = v;
                        objArr[1] = lVar.a(obj, v.getContext());
                    } else {
                        Object[] objArr2 = e.l.f.get();
                        objArr2[0] = v;
                        objArr2[1] = num;
                        objArr2[2] = lVar.a(obj, v.getContext());
                        objArr = objArr2;
                    }
                    lVar.c.invoke(viewManager, objArr);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th) {
                    s55.e(ViewManager.class, "Error while updating prop " + str2, th);
                    StringBuilder sbM = akb.m("Error while updating property '", str2, "' of a view managed by: ");
                    sbM.append(viewManager.getName());
                    throw new JSApplicationIllegalArgumentException(sbM.toString(), th);
                }
            }
        }
    }

    public static final class c<T extends View> implements sqg<T> {
        public final ViewManager<T, ?> b;
        public final f<ViewManager<T, ?>, T> c;

        public c(ViewManager<T, ?> viewManager) {
            this.b = viewManager;
            HashMap map = d.a;
            this.c = d.c(viewManager.getClass());
        }

        @Override // defpackage.sqg
        /* JADX INFO: renamed from: m */
        public final void a(T t, String str, Object obj) {
            t.getClass();
            str.getClass();
            this.c.c(this.b, t, str, obj);
        }

        @Override // defpackage.sqg
        /* JADX INFO: renamed from: s */
        public final void f(T t, String str, ReadableArray readableArray) {
            t.getClass();
            str.getClass();
            readableArray.getClass();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.d$d, reason: collision with other inner class name */
    public interface InterfaceC0137d {
        void b(HashMap map);
    }

    public interface e<T extends koc<?>> extends InterfaceC0137d {
        void a(loc locVar, String str, Object obj);
    }

    public interface f<T extends ViewManager<V, ?>, V extends View> extends InterfaceC0137d {
        void c(T t, V v, String str, Object obj);
    }

    public static final void a() {
        com.facebook.react.uimanager.e.a.clear();
        com.facebook.react.uimanager.e.b.clear();
        a.clear();
        b.clear();
    }

    public static Object b(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(name.concat("$$PropsSetter")).newInstance();
        } catch (ClassNotFoundException unused) {
            s55.n("ViewManagerPropertyUpdater", "Could not find generated setter for " + cls);
            return null;
        } catch (IllegalAccessException e2) {
            l6.p("Unable to instantiate methods getter for ".concat(name), e2);
            return null;
        } catch (InstantiationException e3) {
            l6.p("Unable to instantiate methods getter for ".concat(name), e3);
            return null;
        }
    }

    public static f c(Class cls) {
        HashMap map = a;
        f bVar = (f) map.get(cls);
        if (bVar == null) {
            bVar = (f) b(cls);
            if (bVar == null) {
                bVar = new b(cls);
            }
            map.put(cls, bVar);
        }
        return bVar;
    }

    public static e d(Class cls) {
        HashMap map = b;
        e aVar = (e) map.get(cls);
        if (aVar == null) {
            aVar = (e) b(cls);
            if (aVar == null) {
                aVar = new a(cls);
            }
            map.put(cls, aVar);
        }
        return aVar;
    }
}
