/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AMenorExpLogica extends PExpLogica
{
    private PExp _exp_;
    private TMenor _menor_;
    private PSomaMenos _somaMenos_;

    public AMenorExpLogica()
    {
        // Constructor
    }

    public AMenorExpLogica(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TMenor _menor_,
        @SuppressWarnings("hiding") PSomaMenos _somaMenos_)
    {
        // Constructor
        setExp(_exp_);

        setMenor(_menor_);

        setSomaMenos(_somaMenos_);

    }

    @Override
    public Object clone()
    {
        return new AMenorExpLogica(
            cloneNode(this._exp_),
            cloneNode(this._menor_),
            cloneNode(this._somaMenos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenorExpLogica(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TMenor getMenor()
    {
        return this._menor_;
    }

    public void setMenor(TMenor node)
    {
        if(this._menor_ != null)
        {
            this._menor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menor_ = node;
    }

    public PSomaMenos getSomaMenos()
    {
        return this._somaMenos_;
    }

    public void setSomaMenos(PSomaMenos node)
    {
        if(this._somaMenos_ != null)
        {
            this._somaMenos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._somaMenos_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._menor_)
            + toString(this._somaMenos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._menor_ == child)
        {
            this._menor_ = null;
            return;
        }

        if(this._somaMenos_ == child)
        {
            this._somaMenos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._menor_ == oldChild)
        {
            setMenor((TMenor) newChild);
            return;
        }

        if(this._somaMenos_ == oldChild)
        {
            setSomaMenos((PSomaMenos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
