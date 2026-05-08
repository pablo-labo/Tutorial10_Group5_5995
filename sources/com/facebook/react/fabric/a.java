package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import defpackage.s59;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements ReactMarker.FabricMarkerListener {

    @Deprecated
    public static final s59 c = new s59();

    @Deprecated
    public static final s59 d = new s59();

    @Deprecated
    public static final s59 e = new s59();

    @Deprecated
    public static final s59 f = new s59();

    @Deprecated
    public static final s59 g = new s59();
    public final LinkedHashMap a = new LinkedHashMap();
    public final ArrayList b = new ArrayList();

    /* JADX INFO: renamed from: com.facebook.react.fabric.a$a, reason: collision with other inner class name */
    public interface InterfaceC0131a {
        void a(b bVar);
    }

    public static final class b {
        public final long a;
        public final LinkedHashMap b = new LinkedHashMap();

        public b(int i) {
            this.a = i;
        }

        public final long a(ReactMarkerConstants reactMarkerConstants) {
            c cVar = (c) this.b.get(reactMarkerConstants);
            if (cVar != null) {
                return cVar.a;
            }
            return -1L;
        }

        public final String toString() {
            return "FabricCommitPoint{mCommitNumber=" + this.a + ", mPoints=" + this.b + "}";
        }
    }

    public static final class c {
        public final long a;

        public c(long j) {
            this.a = j;
        }
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public final void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j, int i2) {
        reactMarkerConstants.getClass();
        if (reactMarkerConstants == ReactMarkerConstants.FABRIC_COMMIT_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_COMMIT_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_DIFF_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_DIFF_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES) {
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.a;
            b bVar = (b) linkedHashMap.get(numValueOf);
            if (bVar == null) {
                bVar = new b(i);
                linkedHashMap.put(Integer.valueOf(i), bVar);
            }
            bVar.b.put(reactMarkerConstants, new c(j));
            if (reactMarkerConstants != ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || j <= 0) {
                return;
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((InterfaceC0131a) it.next()).a(bVar);
            }
            linkedHashMap.remove(Integer.valueOf(i));
        }
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public final void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j) {
        reactMarkerConstants.getClass();
        logFabricMarker(reactMarkerConstants, str, i, j, 0);
    }
}
