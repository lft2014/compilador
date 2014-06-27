/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class ALeiaConjComandos extends PConjComandos
{
    private PConjComandos _conjComandos_;
    private PComandoLeia _comandoLeia_;

    public ALeiaConjComandos()
    {
        // Constructor
    }

    public ALeiaConjComandos(
        @SuppressWarnings("hiding") PConjComandos _conjComandos_,
        @SuppressWarnings("hiding") PComandoLeia _comandoLeia_)
    {
        // Constructor
        setConjComandos(_conjComandos_);

        setComandoLeia(_comandoLeia_);

    }

    @Override
    public Object clone()
    {
        return new ALeiaConjComandos(
            cloneNode(this._conjComandos_),
            cloneNode(this._comandoLeia_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeiaConjComandos(this);
    }

    public PConjComandos getConjComandos()
    {
        return this._conjComandos_;
    }

    public void setConjComandos(PConjComandos node)
    {
        if(this._conjComandos_ != null)
        {
            this._conjComandos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._conjComandos_ = node;
    }

    public PComandoLeia getComandoLeia()
    {
        return this._comandoLeia_;
    }

    public void setComandoLeia(PComandoLeia node)
    {
        if(this._comandoLeia_ != null)
        {
            this._comandoLeia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comandoLeia_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._conjComandos_)
            + toString(this._comandoLeia_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._conjComandos_ == child)
        {
            this._conjComandos_ = null;
            return;
        }

        if(this._comandoLeia_ == child)
        {
            this._comandoLeia_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._conjComandos_ == oldChild)
        {
            setConjComandos((PConjComandos) newChild);
            return;
        }

        if(this._comandoLeia_ == oldChild)
        {
            setComandoLeia((PComandoLeia) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
