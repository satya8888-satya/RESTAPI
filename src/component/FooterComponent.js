import React from 'react'

const FooterComponent = () => {
  return (
    <div>
        <footer className='footer'>
        <span>SriRama Technologies</span>
            <span> All Right Reserved &copy; {new Date().getFullYear()}</span>
        </footer>
    </div>
  )
}

export default FooterComponent

