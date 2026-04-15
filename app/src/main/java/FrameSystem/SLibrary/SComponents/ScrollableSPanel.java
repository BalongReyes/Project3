
package FrameSystem.SLibrary.SComponents;

import java.awt.Dimension;
import java.awt.Rectangle;

public class ScrollableSPanel extends SPanel implements javax.swing.Scrollable {

    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return getPreferredSize();
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 10;
    }

    private int blockIncrement = 50;
    
    public void setBlockIncrement(int blockIncrement) {
        this.blockIncrement = blockIncrement;
    }

    public int getBlockIncrement() {
        return blockIncrement;
    }
    
    @Override
    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return blockIncrement;
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return true;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return false;
    }
}
