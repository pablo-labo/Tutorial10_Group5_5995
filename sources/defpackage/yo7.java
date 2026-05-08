package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.gpf;
import defpackage.meb;
import defpackage.oeb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yo7 {
    public static final int[] l = {0, 0};
    public HashMap a;
    public HashMap b;
    public final ViewGroup k;
    public final HashSet d = new HashSet();
    public int e = -1;
    public int f = -1;
    public int g = 0;
    public int h = 0;
    public volatile long i = 0;
    public boolean j = true;
    public final HashMap c = new HashMap();

    public class a implements Choreographer.FrameCallback {
        public final /* synthetic */ MotionEvent a;
        public final /* synthetic */ EventDispatcher b;
        public final /* synthetic */ boolean c;

        public a(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z) {
            this.a = motionEvent;
            this.b = eventDispatcher;
            this.c = z;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            if (yo7.this.i != this.a.getEventTime()) {
                yo7.this.e(this.a, this.b, this.c);
            }
            yo7.this.j = true;
        }
    }

    public yo7(ViewGroup viewGroup) {
        this.k = viewGroup;
    }

    public static void a(String str, meb.a aVar, MotionEvent motionEvent, ArrayList arrayList, EventDispatcher eventDispatcher) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eventDispatcher.a(meb.c(str, ((gpf.b) it.next()).a, aVar, motionEvent));
        }
    }

    public static ArrayList b(List list, oeb.a aVar, oeb.a aVar2, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        if (!z) {
            boolean z2 = false;
            for (int size = list.size() - 1; size >= 0; size--) {
                View view = ((gpf.b) list.get(size)).b;
                if (!z2 && !oeb.b(view, aVar2) && !oeb.b(view, aVar)) {
                    arrayList.remove(size);
                } else if (!z2 && oeb.b(view, aVar2)) {
                    z2 = true;
                }
            }
        }
        return arrayList;
    }

    public static boolean f(List<gpf.b> list, oeb.a aVar, oeb.a aVar2) {
        for (gpf.b bVar : list) {
            if (oeb.b(bVar.b, aVar) || oeb.b(bVar.b, aVar2)) {
                return true;
            }
        }
        return false;
    }

    public final void c(int i, meb.a aVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        oeb.a aVar2;
        oeb.a aVar3;
        int i2;
        int i3 = aVar.b;
        HashMap map = aVar.f;
        List arrayList = i != -1 ? (List) map.get(Integer.valueOf(i3)) : new ArrayList();
        HashMap map2 = this.a;
        List arrayList2 = (map2 == null || !map2.containsKey(Integer.valueOf(i3))) ? new ArrayList() : (List) this.a.get(Integer.valueOf(i3));
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int iMin = Math.min(arrayList.size(), arrayList2.size());
            aVar2 = oeb.a.Y;
            aVar3 = oeb.a.W;
            if (i4 >= iMin || !((gpf.b) arrayList.get((arrayList.size() - 1) - i4)).equals(arrayList2.get((arrayList2.size() - 1) - i4))) {
                break;
            }
            View view = ((gpf.b) arrayList.get((arrayList.size() - 1) - i4)).b;
            if (!z && oeb.b(view, aVar3)) {
                z = true;
            }
            if (!z2 && oeb.b(view, aVar2)) {
                z2 = true;
            }
            i4++;
        }
        if (i4 < Math.max(arrayList.size(), arrayList2.size())) {
            this.g = (this.g + 1) % Integer.MAX_VALUE;
            if (arrayList2.size() > 0) {
                int i5 = ((gpf.b) arrayList2.get(0)).a;
                i2 = i3;
                if (f(arrayList2, oeb.a.d0, oeb.a.e0)) {
                    eventDispatcher.a(meb.c("topPointerOut", i5, aVar, motionEvent));
                }
                ArrayList arrayListB = b(arrayList2.subList(0, arrayList2.size() - i4), oeb.a.X, aVar2, z2);
                if (arrayListB.size() > 0) {
                    a("topPointerLeave", aVar, motionEvent, arrayListB, eventDispatcher);
                }
            } else {
                i2 = i3;
            }
            if (f(arrayList, oeb.a.f0, oeb.a.g0)) {
                eventDispatcher.a(meb.c("topPointerOver", i, aVar, motionEvent));
            }
            ArrayList arrayListB2 = b(arrayList.subList(0, arrayList.size() - i4), oeb.a.V, aVar3, z);
            if (arrayListB2.size() > 0) {
                Collections.reverse(arrayListB2);
                a("topPointerEnter", aVar, motionEvent, arrayListB2, eventDispatcher);
            }
        } else {
            i2 = i3;
        }
        HashMap map3 = new HashMap(map);
        if (i == -1) {
            map3.remove(Integer.valueOf(i2));
        }
        this.a = map3;
    }

    public final void d(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z) {
        if (this.e != -1) {
            return;
        }
        if (!z || !this.j || motionEvent.getActionMasked() != 10) {
            e(motionEvent, eventDispatcher, z);
        } else {
            this.j = false;
            Choreographer.getInstance().postFrameCallback(new a(motionEvent, eventDispatcher, z));
        }
    }

    public final void e(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z) {
        int i;
        View view;
        ArrayList arrayList;
        int i2;
        float[] fArr;
        char c;
        oeb.a aVar;
        ViewGroup viewGroup;
        oeb.a aVar2 = oeb.a.d;
        oeb.a aVar3 = oeb.a.c;
        int[] iArr = l;
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int i3 = 0;
        if (actionMasked == 0) {
            this.i = motionEvent.getEventTime();
            this.f = motionEvent.getPointerId(0);
        } else if (actionMasked == 7) {
            this.d.add(Integer.valueOf(pointerId));
        }
        ViewGroup viewGroup2 = this.k;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i4 >= motionEvent.getPointerCount()) {
                break;
            }
            float x = motionEvent.getX(i4);
            float y = motionEvent.getY(i4);
            int i6 = pointerId;
            float[] fArr2 = new float[2];
            fArr2[i5] = x;
            fArr2[1] = y;
            float f = fArr2[i5];
            float f2 = fArr2[1];
            float[] fArr3 = gpf.a;
            viewGroup2.getClass();
            UiThreadUtil.assertOnUiThread();
            float[] fArr4 = new float[2];
            fArr4[i5] = f;
            fArr4[1] = f2;
            ArrayList arrayList2 = new ArrayList();
            View viewC = gpf.c(fArr4, viewGroup2, arrayList2);
            oeb.a aVar4 = aVar2;
            if (viewC != null) {
                viewGroup = viewGroup2;
                View view2 = viewC;
                int i7 = i5;
                while (view2 != null && view2.getId() <= 0) {
                    Object parent = view2.getParent();
                    oeb.a aVar5 = aVar3;
                    view2 = parent instanceof View ? (View) parent : null;
                    i7++;
                    aVar3 = aVar5;
                }
                aVar = aVar3;
                if (i7 > 0 && i7 <= arrayList2.size()) {
                    arrayList2.subList(i7, arrayList2.size());
                }
                if (view2 != null) {
                    int iReactTagForTouch = view2 instanceof yjc ? ((yjc) view2).reactTagForTouch(fArr4[i5], fArr4[1]) : view2.getId();
                    if (iReactTagForTouch != view2.getId()) {
                        arrayList2.add(i5, new gpf.b(null, iReactTagForTouch));
                    }
                }
            } else {
                aVar = aVar3;
                viewGroup = viewGroup2;
            }
            int pointerId2 = motionEvent.getPointerId(i4);
            map.put(Integer.valueOf(pointerId2), fArr4);
            map2.put(Integer.valueOf(pointerId2), arrayList2);
            map3.put(Integer.valueOf(pointerId2), fArr2);
            Integer numValueOf = Integer.valueOf(pointerId2);
            this.k.getLocationOnScreen(iArr);
            map4.put(numValueOf, new float[]{fArr2[0] + iArr[0], fArr2[1] + iArr[1]});
            i4++;
            pointerId = i6;
            viewGroup2 = viewGroup;
            aVar2 = aVar4;
            aVar3 = aVar;
            i3 = 0;
        }
        oeb.a aVar6 = aVar2;
        oeb.a aVar7 = aVar3;
        meb.a aVar8 = new meb.a(this.f, pointerId, this.h, dmc.h(viewGroup2), map, map2, map3, map4, this.d);
        int i8 = pointerId;
        boolean z2 = z && actionMasked == 10;
        if (z2) {
            HashMap map5 = this.a;
            List list = map5 != null ? (List) map5.get(Integer.valueOf(i8)) : null;
            if (list == null || list.isEmpty()) {
                return;
            }
            gpf.b bVar = (gpf.b) list.get(list.size() - 1);
            i = bVar.a;
            view = bVar.b;
            map2.put(Integer.valueOf(i8), new ArrayList());
        } else {
            List list2 = (List) map2.get(Integer.valueOf(i8));
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            gpf.b bVar2 = (gpf.b) list2.get(0);
            i = bVar2.a;
            view = bVar2.b;
        }
        c(i, aVar8, motionEvent, eventDispatcher);
        switch (actionMasked) {
            case 0:
            case 5:
                List list3 = (List) map2.get(Integer.valueOf(i8));
                this.g = (this.g + 1) % Integer.MAX_VALUE;
                if (!this.d.contains(Integer.valueOf(i8))) {
                    if (f(list3, oeb.a.f0, oeb.a.g0)) {
                        eventDispatcher.a(meb.c("topPointerOver", i, aVar8, motionEvent));
                    }
                    ArrayList arrayListB = b(list3, oeb.a.V, oeb.a.W, false);
                    Collections.reverse(arrayListB);
                    a("topPointerEnter", aVar8, motionEvent, arrayListB, eventDispatcher);
                }
                if (f(list3, aVar7, aVar6)) {
                    this.c.put(Integer.valueOf(i8), new ArrayList(list3));
                }
                if (f(list3, oeb.a.e, oeb.a.f)) {
                    eventDispatcher.a(meb.c("topPointerDown", i, aVar8, motionEvent));
                }
                break;
            case 1:
            case 6:
                this.g = (this.g + 1) % Integer.MAX_VALUE;
                HashSet hashSet = this.d;
                List<gpf.b> list4 = (List) map2.get(Integer.valueOf(i8));
                if (f(list4, oeb.a.b0, oeb.a.c0)) {
                    eventDispatcher.a(meb.c("topPointerUp", i, aVar8, motionEvent));
                }
                if (!hashSet.contains(Integer.valueOf(i8))) {
                    if (f(list4, oeb.a.d0, oeb.a.e0)) {
                        eventDispatcher.a(meb.c("topPointerOut", i, aVar8, motionEvent));
                    }
                    a("topPointerLeave", aVar8, motionEvent, b(list4, oeb.a.X, oeb.a.Y, false), eventDispatcher);
                }
                List list5 = (List) this.c.remove(Integer.valueOf(i8));
                if (list5 != null && f(list4, aVar7, aVar6)) {
                    if (list5.isEmpty() || list4.isEmpty()) {
                        arrayList = new ArrayList();
                    } else {
                        HashSet hashSet2 = new HashSet(list5);
                        ArrayList arrayList3 = new ArrayList();
                        for (gpf.b bVar3 : list4) {
                            if (hashSet2.contains(bVar3)) {
                                arrayList3.add(bVar3);
                            }
                        }
                        arrayList = arrayList3;
                    }
                    if (!arrayList.isEmpty()) {
                        eventDispatcher.a(meb.c("topClick", ((gpf.b) arrayList.get(0)).a, aVar8, motionEvent));
                    }
                }
                if (motionEvent.getActionMasked() == 1) {
                    this.f = -1;
                }
                hashSet.remove(Integer.valueOf(i8));
                break;
            case 2:
                h(i, aVar8, motionEvent, eventDispatcher);
                break;
            case 3:
                hh1.m(this.e == -1, "Expected to not have already sent a cancel for this gesture");
                List list6 = (List) map2.get(Integer.valueOf(i8));
                if (!list6.isEmpty() && view != null) {
                    if (f(list6, oeb.a.a, oeb.a.b)) {
                        int i9 = ((gpf.b) list6.get(0)).a;
                        Rect rect = new Rect(0, 0, 1, 1);
                        this.k.offsetDescendantRectToMyCoords(view, rect);
                        int[] iArr2 = {rect.top, rect.left};
                        float f3 = iArr2[0];
                        float f4 = iArr2[1];
                        HashMap map6 = new HashMap(map);
                        HashMap map7 = new HashMap(map3);
                        HashMap map8 = new HashMap(map4);
                        i2 = Integer.MAX_VALUE;
                        float[] fArr5 = {f3, f4};
                        Iterator it = map6.entrySet().iterator();
                        while (it.hasNext()) {
                            ((Map.Entry) it.next()).setValue(fArr5);
                        }
                        float[] fArr6 = {0.0f, 0.0f};
                        Iterator it2 = map7.entrySet().iterator();
                        while (it2.hasNext()) {
                            ((Map.Entry) it2.next()).setValue(fArr6);
                        }
                        this.k.getLocationOnScreen(iArr);
                        float[] fArr7 = {fArr5[0] + iArr[0], fArr5[1] + iArr[1]};
                        Iterator it3 = map8.entrySet().iterator();
                        while (it3.hasNext()) {
                            ((Map.Entry) it3.next()).setValue(fArr7);
                        }
                        meb.a aVar9 = new meb.a(aVar8.a, aVar8.b, aVar8.c, aVar8.d, map6, new HashMap(map2), map7, map8, new HashSet(aVar8.i));
                        hh1.n(eventDispatcher);
                        eventDispatcher.a(meb.c("topPointerCancel", i9, aVar9, motionEvent));
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    this.g = (this.g + 1) % i2;
                    this.f = -1;
                }
                c(-1, aVar8, motionEvent, eventDispatcher);
                break;
            case 4:
            case 8:
            default:
                s55.n("ReactNative", "Motion Event was ignored. Action=" + actionMasked + " Target=" + i);
                return;
            case 7:
                float[] fArr8 = (float[]) map3.get(Integer.valueOf(i8));
                HashMap map9 = this.b;
                if (map9 == null || !map9.containsKey(Integer.valueOf(i8))) {
                    c = 0;
                    fArr = new float[]{0.0f, 0.0f};
                } else {
                    fArr = (float[]) this.b.get(Integer.valueOf(i8));
                    c = 0;
                }
                if (Math.abs(fArr[c] - fArr8[c]) <= 0.1f && Math.abs(fArr[1] - fArr8[1]) <= 0.1f) {
                    return;
                } else {
                    h(i, aVar8, motionEvent, eventDispatcher);
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                return;
            case 10:
                if (z2) {
                    h(i, aVar8, motionEvent, eventDispatcher);
                }
                break;
        }
        this.b = new HashMap(aVar8.g);
        this.h = motionEvent.getButtonState();
        this.d.retainAll(this.b.keySet());
    }

    public final void g(View view, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.e != -1 || view == null) {
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        this.k.getLocationOnScreen(new int[2]);
        motionEventObtain.setLocation(motionEvent.getRawX() - r1[0], motionEvent.getRawY() - r1[1]);
        motionEventObtain.setAction(3);
        d(motionEventObtain, eventDispatcher, false);
        this.e = view.getId();
    }

    public final void h(int i, meb.a aVar, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (f((List) aVar.f.get(Integer.valueOf(aVar.b)), oeb.a.Z, oeb.a.a0)) {
            short s = (short) (this.g & 65535);
            meb mebVarAcquire = meb.g.acquire();
            if (mebVarAcquire == null) {
                mebVarAcquire = new meb();
            }
            hh1.n(motionEvent);
            mebVarAcquire.init(aVar.d, i, motionEvent.getEventTime());
            mebVarAcquire.b = "topPointerMove";
            mebVarAcquire.a = MotionEvent.obtain(motionEvent);
            mebVarAcquire.c = s;
            mebVarAcquire.e = aVar;
            eventDispatcher.a(mebVarAcquire);
        }
    }
}
