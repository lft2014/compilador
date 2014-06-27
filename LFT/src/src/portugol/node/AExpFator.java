/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AExpFator extends PFator
{
    private TEsqParen _esqParen_;
    private PExp _exp_;
    private TDirParen _dirParen_;

    public AExpFator()
    {
        // Constructor
    }

    public AExpFator(
        @SuppressWarnings("hiding") TEsqParen _esqParen_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TDirParen _dirParen_)
    {
        // Constructor
        setEsqParen(_esqParen_);

        setExp(_exp_);

        setDirParen(_dirParen_);

    }

    @Override
    public Object clone()
    {
        return new AExpFator(
            cloneNode(this._esqParen_),
            cloneNode(this._exp_),
            cloneNode(this._dirParen_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpFator(this);
    }

    public TEsqParen getEsqParen()
    {
        return this._esqParen_;
    }

    public void setEsqParen(TEsqParen node)
    {
        if(this._esqParen_ != null)
        {
            this._esqParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esqParen_ = node;
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

    public TDirParen getDirParen()
    {
        return this._dirParen_;
    }

    public void setDirParen(TDirParen node)
    {
        if(this._dirParen_ != null)
        {
            this._dirParen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dirParen_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esqParen_)
            + toString(this._exp_)
            + toString(this._dirParen_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esqParen_ == child)
        {
            this._esqParen_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._dirParen_ == child)
        {
            this._dirParen_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esqParen_ == oldChild)
        {
            setEsqParen((TEsqParen) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._dirParen_ == oldChild)
        {
            setDirParen((TDirParen) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
