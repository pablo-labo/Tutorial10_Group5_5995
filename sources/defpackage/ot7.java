package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.cpf;

/* JADX INFO: loaded from: classes2.dex */
public final class ot7 {
    public final ViewGroup a;
    public boolean d;
    public int b = -1;
    public final float[] c = new float[2];
    public long e = Long.MIN_VALUE;
    public final dpf f = new dpf();

    public ot7(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.b == -1) {
            s55.n("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        hh1.m(!this.d, "Expected to not have already sent a cancel for this gesture");
        hh1.n(eventDispatcher);
        pgb<cpf> pgbVar = cpf.f;
        int iH = dmc.h(this.a);
        int i = this.b;
        long j = this.e;
        float[] fArr = this.c;
        eventDispatcher.a(cpf.a.a(iH, i, epf.CANCEL, motionEvent, j, fArr[0], fArr[1], this.f));
    }

    public final void b(MotionEvent motionEvent, EventDispatcher eventDispatcher, ReactContext reactContext) {
        UIManager uIManagerJ;
        UIManager uIManagerJ2;
        UIManager uIManagerJ3;
        motionEvent.getClass();
        eventDispatcher.getClass();
        int action = motionEvent.getAction() & 255;
        epf epfVar = epf.START;
        float[] fArr = this.c;
        ViewGroup viewGroup = this.a;
        if (action == 0) {
            if (this.b != -1) {
                s55.f("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.d = false;
            this.e = motionEvent.getEventTime();
            this.b = gpf.a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            int iH = dmc.h(viewGroup);
            int i = this.b;
            if (reactContext != null && (uIManagerJ3 = dmc.j(reactContext, 2, true)) != null) {
                uIManagerJ3.markActiveTouchForTag(iH, i);
            }
            pgb<cpf> pgbVar = cpf.f;
            eventDispatcher.a(cpf.a.a(dmc.h(viewGroup), this.b, epfVar, motionEvent, this.e, fArr[0], fArr[1], this.f));
            return;
        }
        if (this.d) {
            return;
        }
        int i2 = this.b;
        if (i2 == -1) {
            s55.f("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            return;
        }
        epf epfVar2 = epf.END;
        if (action == 1) {
            gpf.a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            int iH2 = dmc.h(viewGroup);
            pgb<cpf> pgbVar2 = cpf.f;
            eventDispatcher.a(cpf.a.a(iH2, this.b, epfVar2, motionEvent, this.e, fArr[0], fArr[1], this.f));
            int i3 = this.b;
            if (reactContext != null && (uIManagerJ2 = dmc.j(reactContext, 2, true)) != null) {
                uIManagerJ2.sweepActiveTouchForTag(iH2, i3);
            }
            this.b = -1;
            this.e = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            gpf.a(motionEvent.getX(), motionEvent.getY(), viewGroup, fArr);
            pgb<cpf> pgbVar3 = cpf.f;
            eventDispatcher.a(cpf.a.a(dmc.h(viewGroup), this.b, epf.MOVE, motionEvent, this.e, fArr[0], fArr[1], this.f));
            return;
        }
        if (action == 5) {
            pgb<cpf> pgbVar4 = cpf.f;
            eventDispatcher.a(cpf.a.a(dmc.h(viewGroup), this.b, epfVar, motionEvent, this.e, fArr[0], fArr[1], this.f));
            return;
        }
        if (action == 6) {
            pgb<cpf> pgbVar5 = cpf.f;
            eventDispatcher.a(cpf.a.a(dmc.h(viewGroup), this.b, epfVar2, motionEvent, this.e, fArr[0], fArr[1], this.f));
            return;
        }
        if (action != 3) {
            s55.n("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + i2);
            return;
        }
        if (this.f.a.get((int) motionEvent.getDownTime(), -1) != -1) {
            a(motionEvent, eventDispatcher);
        } else {
            s55.f("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
        }
        int iH3 = dmc.h(viewGroup);
        int i4 = this.b;
        if (reactContext != null && (uIManagerJ = dmc.j(reactContext, 2, true)) != null) {
            uIManagerJ.sweepActiveTouchForTag(iH3, i4);
        }
        this.b = -1;
        this.e = Long.MIN_VALUE;
    }

    public final void c(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        motionEvent.getClass();
        eventDispatcher.getClass();
        if (this.d) {
            return;
        }
        a(motionEvent, eventDispatcher);
        this.d = true;
        this.b = -1;
    }
}
