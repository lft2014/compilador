/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AMenosSomaMenos extends PSomaMenos
{
    private PSomaMenos _somaMenos_;
    private TMenos _menos_;
    private PTermo _termo_;

    public AMenosSomaMenos()
    {
        // Constructor
    }

    public AMenosSomaMenos(
        @SuppressWarnings("hiding") PSomaMenos _somaMenos_,
        @SuppressWarnings("hiding") TMenos _menos_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setSomaMenos(_somaMenos_);

        setMenos(_menos_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new AMenosSomaMenos(
            cloneNode(this._somaMenos_),
            cloneNode(this._menos_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMenosSomaMenos(this);
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

    public TMenos getMenos()
    {
        return this._menos_;
    }

    public void setMenos(TMenos node)
    {
        if(this._menos_ != null)
        {
            this._menos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._menos_ = node;
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._somaMenos_)
            + toString(this._menos_)
            + toString(this._termo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._somaMenos_ == child)
        {
            this._somaMenos_ = null;
            return;
        }

        if(this._menos_ == child)
        {
            this._menos_ = null;
            return;
        }

        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._somaMenos_ == oldChild)
        {
            setSomaMenos((PSomaMenos) newChild);
            return;
        }

        if(this._menos_ == oldChild)
        {
            setMenos((TMenos) newChild);
            return;
        }

        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}