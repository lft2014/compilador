/* This file was generated by SableCC (http://www.sablecc.org/). */

package portugol.node;

import portugol.analysis.*;

@SuppressWarnings("nls")
public final class AComandoCaso extends PComandoCaso
{
    private TCaso _caso_;
    private PValor _valor_;
    private TDoispontos _doispontos_;
    private PConjComandos _conjComandos_;

    public AComandoCaso()
    {
        // Constructor
    }

    public AComandoCaso(
        @SuppressWarnings("hiding") TCaso _caso_,
        @SuppressWarnings("hiding") PValor _valor_,
        @SuppressWarnings("hiding") TDoispontos _doispontos_,
        @SuppressWarnings("hiding") PConjComandos _conjComandos_)
    {
        // Constructor
        setCaso(_caso_);

        setValor(_valor_);

        setDoispontos(_doispontos_);

        setConjComandos(_conjComandos_);

    }

    @Override
    public Object clone()
    {
        return new AComandoCaso(
            cloneNode(this._caso_),
            cloneNode(this._valor_),
            cloneNode(this._doispontos_),
            cloneNode(this._conjComandos_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComandoCaso(this);
    }

    public TCaso getCaso()
    {
        return this._caso_;
    }

    public void setCaso(TCaso node)
    {
        if(this._caso_ != null)
        {
            this._caso_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._caso_ = node;
    }

    public PValor getValor()
    {
        return this._valor_;
    }

    public void setValor(PValor node)
    {
        if(this._valor_ != null)
        {
            this._valor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._valor_ = node;
    }

    public TDoispontos getDoispontos()
    {
        return this._doispontos_;
    }

    public void setDoispontos(TDoispontos node)
    {
        if(this._doispontos_ != null)
        {
            this._doispontos_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doispontos_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._caso_)
            + toString(this._valor_)
            + toString(this._doispontos_)
            + toString(this._conjComandos_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._caso_ == child)
        {
            this._caso_ = null;
            return;
        }

        if(this._valor_ == child)
        {
            this._valor_ = null;
            return;
        }

        if(this._doispontos_ == child)
        {
            this._doispontos_ = null;
            return;
        }

        if(this._conjComandos_ == child)
        {
            this._conjComandos_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._caso_ == oldChild)
        {
            setCaso((TCaso) newChild);
            return;
        }

        if(this._valor_ == oldChild)
        {
            setValor((PValor) newChild);
            return;
        }

        if(this._doispontos_ == oldChild)
        {
            setDoispontos((TDoispontos) newChild);
            return;
        }

        if(this._conjComandos_ == oldChild)
        {
            setConjComandos((PConjComandos) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
