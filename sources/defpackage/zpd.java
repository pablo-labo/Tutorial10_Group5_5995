package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import androidx.work.impl.WorkDatabase_Impl;
import defpackage.mfd;
import defpackage.xn1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSink;

/* JADX INFO: loaded from: classes3.dex */
public final class zpd implements VideoProcessor, a4h {
    public static final lve c = new lve("_root_");
    public Object a;
    public final Object b;

    public zpd(vh8 vh8Var) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        lve lveVar = c;
        qpd qpdVar = new qpd(lveVar, vh8Var);
        this.b = qpdVar;
        hashSet.add(lveVar);
        concurrentHashMap.put("_root_", qpdVar);
    }

    public static boolean d(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            s55.r("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        s55.r("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // defpackage.a4h
    public ArrayList a(String str) throws IOException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        TreeMap<Integer, mfd> treeMap = mfd.X;
        mfd mfdVarA = mfd.a.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            mfdVarA.u(1);
        } else {
            mfdVarA.n(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorI = pg8.I(workDatabase_Impl, mfdVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorI.getCount());
            while (cursorI.moveToNext()) {
                arrayList.add(cursorI.isNull(0) ? null : cursorI.getString(0));
            }
            return arrayList;
        } finally {
            cursorI.close();
            mfdVarA.s();
        }
    }

    @Override // defpackage.a4h
    public void b(String str, Set set) throws Throwable {
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            z3h z3hVar = new z3h((String) it.next(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            try {
                ((b4h) this.b).j(z3hVar);
                workDatabase_Impl.w();
            } finally {
                workDatabase_Impl.s();
            }
        }
    }

    public Bitmap c(int i) {
        Object objPollFirst;
        xn1 xn1Var = (xn1) this.b;
        synchronized (xn1Var) {
            xn1.a aVar = xn1Var.a.get(i);
            if (aVar == null) {
                objPollFirst = null;
            } else {
                objPollFirst = aVar.c.pollFirst();
                if (xn1Var.b != aVar) {
                    xn1Var.a(aVar);
                    xn1.a aVar2 = xn1Var.b;
                    if (aVar2 == null) {
                        xn1Var.b = aVar;
                        xn1Var.c = aVar;
                    } else {
                        aVar.d = aVar2;
                        aVar2.a = aVar;
                        xn1Var.b = aVar;
                    }
                }
            }
        }
        if (objPollFirst != null) {
            synchronized (this) {
                ((HashSet) this.a).remove(objPollFirst);
            }
        }
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !d(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object e() {
        Object obj;
        xn1 xn1Var = (xn1) this.b;
        synchronized (xn1Var) {
            xn1.a<T> aVar = xn1Var.c;
            if (aVar == 0) {
                obj = null;
            } else {
                Object objPollLast = aVar.c.pollLast();
                if (aVar.c.isEmpty()) {
                    xn1Var.a(aVar);
                    xn1Var.a.remove(aVar.b);
                }
                obj = objPollLast;
            }
        }
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            ((HashSet) this.a).remove(obj);
        }
        return obj;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        videoFrame.retain();
        Iterator it = ((List) this.b).iterator();
        VideoFrame videoFrameA = videoFrame;
        while (it.hasNext()) {
            videoFrameA = ((tng) it.next()).a();
            if (videoFrameA == null) {
                ((VideoSink) this.a).onFrame(videoFrame);
                videoFrame.release();
                return;
            }
        }
        ((VideoSink) this.a).onFrame(videoFrameA);
        videoFrameA.release();
        videoFrame.release();
    }

    @Override // org.webrtc.VideoProcessor
    public void setSink(VideoSink videoSink) {
        this.a = videoSink;
    }

    public zpd(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        this.b = new b4h(workDatabase_Impl);
        new c4h(workDatabase_Impl);
    }

    public zpd() {
        this.a = new HashSet();
        this.b = new xn1();
    }

    public zpd(List list, SurfaceTextureHelper surfaceTextureHelper) {
        this.b = list;
    }
}
